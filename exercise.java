import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram{
	
	private int factorial(int a){
		for(int i = 1; i < a; i++){
			if(a > 0){
				a = a * i;
			}
		}
		return a;
	}
	
	public void run(){
		int k = readInt("");
		println(factorial(k));
	}
}
