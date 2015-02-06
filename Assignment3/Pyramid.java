/* The goal is to draw a pyramid in the center of the screen
 * number of bricks in the base is a constant
 * each upper row has one brick less
 */
import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final double BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	private static final Color FIRST_COLOUR = new Color(139,69,19);
	
	public void run() {
		
		int bricks_in_line = BRICKS_IN_BASE;
		int curr_row = 1;
		
		while (bricks_in_line>0) {
			drow_line_of_bricks(bricks_in_line,curr_row);
			bricks_in_line--;
			curr_row++;
		}
	}
	
	private void drow_line_of_bricks(int bricks,int rows) {
		double h_pos_of_first_brick = (getWidth()-BRICK_WIDTH*bricks)/2;
		double v_pos_of_first_brick = getHeight()-BRICK_HEIGHT*rows;
		for (int i=0;i<bricks;i++) {
			draw_one_brick(h_pos_of_first_brick+BRICK_WIDTH*i,v_pos_of_first_brick,BRICK_WIDTH,BRICK_HEIGHT);
		}
	}
	
	private void draw_one_brick(double h_pos,double v_pos,double width,double height) {
		GRect brick = new GRect(width,height);
		add(brick,h_pos,v_pos);
	}
}
	
	

