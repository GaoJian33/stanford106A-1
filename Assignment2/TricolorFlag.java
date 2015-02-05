/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class TricolorFlag extends GraphicsProgram {
	/* The width and height of the flag. Many flags have an aspect ratio of 3:2 and
	 * our choice of constants here assumes this. Feel free to change these constants
	 * if you're drawing a flag with a different aspect ratio.
	 */
	private static final double FLAG_WIDTH  = 300;
	private static final double FLAG_HEIGHT = 200;
	private static final String COUNTRY = "Timbooktoe";
	private static final Color FIRST_COLOUR = new Color(139,69,19);
	private static final Color SECOND_COLOUR = new Color(2,15,255);
	private static final Color THIRD_COLOUR = new Color(56,56,56);

	
	public void run() {
		int app_w_left_corner = getWidth()/2-(int)FLAG_WIDTH/2;
		int app_h_upper_corner = getHeight()/2-(int)FLAG_HEIGHT/2;
		add(coloured_rect(app_w_left_corner,app_h_upper_corner,(int)FLAG_WIDTH/3,(int)FLAG_HEIGHT,FIRST_COLOUR));
		add(coloured_rect(app_w_left_corner+(int)FLAG_WIDTH/3,app_h_upper_corner,(int)FLAG_WIDTH/3,(int)FLAG_HEIGHT,SECOND_COLOUR));
		add(coloured_rect(app_w_left_corner+(int)FLAG_WIDTH/3*2,app_h_upper_corner,(int)FLAG_WIDTH/3,(int)FLAG_HEIGHT,THIRD_COLOUR));
		
		GLabel country_label = new GLabel("The flag of " + COUNTRY);
		country_label.setFont("Times-32");
		add(country_label, getWidth()-country_label.getWidth()-3, getHeight() - country_label.getAscent()/2);
	}
	
	private GRect coloured_rect(int x,int y,int width,int height,Color colour) {
		GRect coloured_rect = new GRect(x,y,width,height);
		coloured_rect.setFilled(true);
		coloured_rect.setColor(colour);
		coloured_rect.setFillColor(colour);
		return coloured_rect;
	}
}
