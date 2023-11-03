import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram {

	RandomGenerator rgen = new RandomGenerator();

	private static final double NUM_EXPERIMENTS = 20;

	public void run() {
		int experiment = 0;
		int result = 0;
		for (int j = 1; j < NUM_EXPERIMENTS; j++) {
			for (int i = 1; i < 1000000; i++) {
				boolean a = rgen.nextBoolean();
				if (a == true) {
					println("arioli");
					result++;
				} else {
					println("reshka");
					result = 0;
				}
				if (result == 3) {
					experiment ++;
					break;
				}
			}
		}
		print(experiment / NUM_EXPERIMENTS);
	}
}
