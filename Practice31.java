import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{	
	
	private int simpleOrComplex(int b){
		int result = 0;
		int a = readInt();
		for (int i = 0; i <= (a / 2); i++){
			a = a ;
			result++;
		}
		return result;
	}
	
	public void run(){
		int k = readInt("enter your number = ");
		println(simpleOrComplex(k));
	}
}
