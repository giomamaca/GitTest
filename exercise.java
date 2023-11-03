import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends ConsoleProgram {
	
	private static final double SENTINEL = 0;
	
	public void run() {
		int max = readInt("? ");
		int min = max;
		if (max != SENTINEL) {
			while (min != SENTINEL) {
				int k = readInt("? ");
				if (k != SENTINEL) {
					if (k < max) {
						min = k;
					}
					if (k > max) {
						max = k;
					}
				} else
					break;
			}
		}
		println("max = " + max);
		println("min = " + min);
	}
}
