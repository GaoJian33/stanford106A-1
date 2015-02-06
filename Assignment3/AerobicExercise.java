/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class AerobicExercise extends ConsoleProgram {
	
	private static final int NUMBER_OF_DAYS_2ASK = 7;
	private static final int MIN_DAYS_CARDIO = 5;
	private static final int MIN_DAYS_PRESSURE = 3;
	private static final int MIN_MINUTES_CARDIO = 30;
	private static final int MIN_MINUTES_PRESSURE = 40;
	
	public void run() {
		
		int days_cardio = 0;
		int days_pressure = 0;
		
		for (int i=1;i<=NUMBER_OF_DAYS_2ASK;i++) {
			int min_current_day = readInt("How many aerobic exercisios did you do on day "+i+"? ");
			if (min_current_day>=MIN_MINUTES_PRESSURE)
				days_pressure++;
			if (min_current_day>=MIN_MINUTES_CARDIO)
				days_cardio++;
		}
		
		println("Cardiovascular Health");
		checkHealth(days_cardio,MIN_DAYS_CARDIO,MIN_MINUTES_CARDIO,"for cardiovascular health");
		println("Blood pressure");
		checkHealth(days_pressure,MIN_DAYS_PRESSURE,MIN_MINUTES_PRESSURE,"to keep a low blood pressure");
		
	}
	
	private void checkHealth(int days,int min_days, int min_minutes, String goal_string) {
		if (days<min_days)
			println("You needed "+min_minutes+" or more minutes of aerobic exercise on at least "+(min_days-days)+" day(s).");
		else
			println("Great job! You have done enough exercise "+goal_string);
	}
	
}
