import acm.program.ConsoleProgram;

public class Practice24 extends ConsoleProgram{
	
	private int numDivisorsSlow(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				result++;
			}
		}
		if(result == 2){
			println("rtulia " + result);
		}
		return result;
	}
	
	public void run(){
		int k = readInt("k = ");
		println("divisiors = " + numDivisorsSlow(k));
	}
}