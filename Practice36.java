import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram {

	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		int divisor = 0;
		int average = 0;
		int result = 0;
		for (int i = 1; i < 1000000; i++) {
			boolean a = rgen.nextBoolean();
			if (a == true) {
				average += i;
				divisor ++;
				println("arioli");
				result++;
			} else {
				println("reshka");
				result = 0;
			}
			if (result == 3) {
				break;
			}
		}
		print(average / divisor);
	}
}
