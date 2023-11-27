
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		int num = readInt();
		int k = num;
		int a = 0;
		while (num != 0) {
			a = a * 10 + num % 10;
			num = num / 10;
		}
		if (a == k) {
			println("correct");
		} else {
			println("not correct");
		}
	}
}
