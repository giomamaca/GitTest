import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{		
	
	private int simpleOrComplex(int a){
		int n = readInt("");
		int result = 0;
		for(int i = 0; i <= (n / 2); i++){ 
			if(n % result == 0){
				result++;
			}
		}
		return result;
	}
	
	public void run(){
		int k = readInt("");
		println(simpleOrComplex(k));
	}
}
