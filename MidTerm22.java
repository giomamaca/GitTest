import acm.program.ConsoleProgram;

public class MidTerm22 extends ConsoleProgram {

	private int divisor = 0;

	public void run() {
		int k = readInt("k = ");
		getBiggestDivisor(k);
		print(divisor);
	}

	private void getBiggestDivisor(int a) {
		for (int i = 1; i <= a; i+=2) {
			if (simple(i)) {
				if(a % i == 0){
					divisor = a;					
				}
			}
		}
	}

	private boolean simple(int a) {
		if (a == 1)
			return false;
		if (a == 2)
			return true;
		if (a % 2 == 0)
			return false;
		for (int i = 3; i * i <= a; i+= 2) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
