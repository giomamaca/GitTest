import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram {

	private static final int SENTINEL = 0;

	public void run() {
		println("This program finds smallest and largest numbers.");
		int large = readInt("?");
		int small = large;
		if (large != SENTINEL) {
			while (small != SENTINEL) {
				int k = readInt("? ");
				if (k != SENTINEL) {
					if (k > large) {
						large = k;
					}
					if (k < large) {
						small = k;
					}
				} else {
					break;
				}
			}
		}
		println("largest : " + large);
		println("smallest: " + small);
	}
}
