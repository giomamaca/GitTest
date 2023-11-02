import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	
	
	
	private int LCM(int a, int b) {
		// swap - Optional (But helps)
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		// it - 12
		int it = a;
		// it - 12; it - 24; it - 36 (and stopped since 36 % 9 == 0)
		while (it % b != 0) {
			it += a;
		}
		// least common multipler
		return it;
	}
	public void run(){
		int c = readInt();
		int k = readInt();
		println(LCM(c, k));
	}
}
