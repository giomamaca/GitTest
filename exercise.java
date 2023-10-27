import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram{
	
	private int factorial(int a){
		for(int i = 1; i <= a; i++){
			   a *= a - 1 ;
			   a = a - 1;
		}
		return a;
	}
	
	public void run(){
		int k = readInt("enter number = ");
		println(factorial(k));
	}
}
