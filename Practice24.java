import acm.program.ConsoleProgram;

public class Practice24 extends ConsoleProgram{
	private int numDivisorsSlow1(int n) {
		// N24
		private int numDivisorsSlow(int n) {
			int result = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					result++;
				}
			}
			return result;
		}
		
		// N24
		private int numDivisorsFast(int n) {
			int result = 0;
			for (int i = 1; i * i <= n; i++) {
				if (i * i == n) {
					result += 1;
				}
				else if (n % i == 0) {
					result += 2;
				}
			}
			return result;
		}
}