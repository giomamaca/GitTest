import acm.program.ConsoleProgram;

public class isGeometriProgres extends ConsoleProgram {

	private static final double STOP = -1;

	public void run() {
		int k = readInt();
		if (k != STOP) {
			int a = readInt();
			while (a != STOP) {
				int d = readInt();
				if (d == STOP) {
					break;
					println("fsadfas");
				}
			}
		}
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
