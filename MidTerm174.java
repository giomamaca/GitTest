import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class MidTerm174 extends ConsoleProgram {

	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		int k = readInt();

		for (int i = 0; true; i++) {
			boolean bool = rgen.nextBoolean();
			if (k != 0) {
				if (bool == true) {
					k /= 2;
				}
				if (bool == false) {
					k -= 1;
				}
				println(k);
			}
		}
	}
}
