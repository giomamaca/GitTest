import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{		
	
	public void run(){
		int result = 0;
		int n = readInt("enter number = ");
		for (int i = 0; i <= n; i++) {
			while(n % i == 0){
				result++;
			}
		}
	}
}
