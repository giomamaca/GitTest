import acm.program.ConsoleProgram;

public class isGeometriProgres extends ConsoleProgram {

	private static final double SENTINEL = -1;

	public void run() {
		int g = 0;
		
		int previous = readInt();
		while(previous != SENTINEL){
			int current = readInt();
			if(current == SENTINEL) break;
			
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
