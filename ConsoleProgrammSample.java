
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	
	private boolean isAlthwenating(int num){
		int last = num % 10;
		num /= 10;
		while(num > 0){
			int dig = num % 10;
			if(dig %2 == last % 2){
				return false;
			}
			num /= 10;
			last = dig;
		}
		return true;
	}
}
