import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram {

	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		int result = 0;
		for (int i = 0; i < 15; i++) {
			boolean a = rgen.nextBoolean();
			if (a == true) {
				print("arioli");
				result++;
			} else {
				print("reshka");
				result = 0;
			}
			if(result == 3){
				break;
			}
		}
	}
}
