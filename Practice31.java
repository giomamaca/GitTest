import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{	
	
	private boolean isPrimeSlow(int n){
		int numdivision = 0;
		for(int i = 1; i <= n; i ++){
			if(n % 2 == 0){
				numdivision++;
			}
		}
		return numdivision == 2;
	}
	
	public void run(){
		int k = readInt("");
		println(isPrimeSlow(k));
	}
}
