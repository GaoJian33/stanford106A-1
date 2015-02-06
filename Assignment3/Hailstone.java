/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int curr_number = readInt("Enter a number: ");
		int num_of_iterations = 0;
		int old_number;
		while (curr_number>1) {
			old_number = curr_number; 
			if (curr_number % 2 == 0) {
				curr_number = curr_number/2;
				println(old_number+" is even, so I take half: "+curr_number);
			} else {
				curr_number = curr_number*3+1;
				println(old_number+" is odd, so I make 3n+1: "+curr_number);
			}
			num_of_iterations++;
		}
		println("The process took "+num_of_iterations+" to reach 1");
	}
}

