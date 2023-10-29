import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{		
	
	public void run(){
		int result = 0;
		int n = readInt("");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				result++;
			}
		}
	}
}
