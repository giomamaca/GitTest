

import acm.program.ConsoleProgram;

public class Practice18 extends ConsoleProgram {
	public void run(){
		int x = readInt ("enter number1:");
		int y = readInt ("enter number2:");
		int max = (x > y) ? x : y ;
		print(max);
	}
}
