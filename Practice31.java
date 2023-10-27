import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{		
	
	private int simpleOrComplex(int a){
		int result = 0;
		for(int i = 0; i <= (a / 2); i++){ 
			result++;
		}
		return result;
	}
	
	public void run(){
		int k = readInt("enter num = ");
		println(simpleOrComplex(k));
	}
}
