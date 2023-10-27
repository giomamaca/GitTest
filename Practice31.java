import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{		
	
	private int simpleOrComplex(int n){
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				result++;
			}
		}
		return result;
	}
	
	
	public void run(){
		int k = readInt("enter num = ");
		println(simpleOrComplex(k));
	}
}
