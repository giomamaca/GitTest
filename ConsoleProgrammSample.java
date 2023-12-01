
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
		int x = 2;
		int y = 4;
		GOval o = new GOval(4, 2); // width, height
		println(racxa(x, 2, o));
		println(racxa(y, x / 2 + x, o));
	}

	public int racxa(int x, int y, GOval o) {
		String s = "hello world";
		x = varesiRacxa(x / y, x + (int) o.getHeight(), s);
		o.scale(2);
		y = varesiRacxa(x, y + (int) o.getHeight(), s);
		return x + y;
	}

	public int varesiRacxa(double x, int y, String s) {
		int z = (int) x + s.charAt(0) - s.charAt(1);
		s = s.substring(1);
		return z + y;
	}
}
