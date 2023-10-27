import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{	
	
	private int simpleOrComplex(int b){
		int a = readInt ("enter a = ");
		for (int i = 0; i <= a / 2; i++){
			if(a % i*a / 2 == 0){
				a = a /i*a / 2;
			}
		}
		return a;
	}
	
	public void run(){
		int k = readInt("enter your number = ");
		println(simpleOrComplex(k));
	}
}
