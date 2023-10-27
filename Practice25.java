import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	
	private int gcd(int n, int m) {
		for (int i = Math.min(n, m); i >= 1; i--) {
			if(n % i == 0 && m % i == 0) { 
				return i;
			}
		}
		return -1;
	}
	
	private int readPositiveInt(String text) {
		int n = readInt(text);
		while( n <= 0) {
			println("Number should positive");
			n = readInt(text);
		}
		return n;
	}
	
	public void run(){
		int n = readPositiveInt("Enter n: ");
		int m = readPositiveInt("Enter m: ");
		int gcd = gcd(n, m);
		println("GCD is: " + gcd);
	}
}
