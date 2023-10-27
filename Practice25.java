import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	
	private int gcdFast(int a, int b) {
		while (a % b != 0 && b % a != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a; 
			}
		}
		return Math.min(a, b);
	}
	
	public void run(){
		int k = readInt("");
		int c = readInt("");
		println(gcdFast(k, c));
	}
}
