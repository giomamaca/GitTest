import acm.program.ConsoleProgram;

public class MidTerm1633 extends ConsoleProgram {

	private int num;

	public void run() {
		// String s = readLine("Fibonacci");
		int a = readInt();
		int b = readInt();
		if (a != 0 && b != 1) {
			return;
		}
		if (a == 1 && b == 0) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (num != -1) {
			num = readInt();
			if (fibonaci(num, b)) {
				println("correct");
			} else {
				println("not correct");
			}
		}
	}

	private boolean fibonaci(int num, int b) {
		int sum = 0;
		sum = b;
		b = num;
		if (num == sum + b)
			return true;

		return false;
	}
}
