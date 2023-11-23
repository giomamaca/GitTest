import acm.program.ConsoleProgram;

public class isGeometriProgres extends ConsoleProgram {

	private static final double SENTINEL = -1;

	public void run() {
		String answer = "yes";
		int count = 1;
		double firstG = 0;
		double previous = readDouble();
		double current = previous;
		while (current != SENTINEL) {
			current = readDouble();
			if (current == SENTINEL)
				break;
			count++;
			if (count == 2) {
				firstG = current / previous;
			} else {
				if (current / previous != firstG) {
					answer = "no";
				}
			}
			previous = current;
		}
		print(answer);
	}

	private double gcd(int d, int a) {
		double div = 0;
		for (int i = 1; i <= d; i++) {
			if (d % i == 0 && a % i == 0) {
				div = i;
			}
		}
		return div;
	}

	private double divisor(double k, double a) {
		double d = a / k;
		return (double) d;
	}
}
