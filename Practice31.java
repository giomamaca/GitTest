import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{		
	
	private int simpleOrComplex(int a){
		int result = 0;
		for(int i = 0; i <= (a / 2); i++){ 
			if(a % i == 0){
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
