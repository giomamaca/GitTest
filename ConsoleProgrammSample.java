
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		String s = "fshdfbasffsafsaf";
		for(int i = 0; i< s.length(); i++){
			String sub1 = s.substring(0,4) + s.substring(s.length() - 4,s.length());
			s =  sub1;
		}
		print(s);
	}
}
