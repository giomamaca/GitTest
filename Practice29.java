import acm.program.ConsoleProgram;

public class Practice29 extends ConsoleProgram{
	private int fibonacci(int n){
		int a = 1, b = 1;
		for(int i = 1; i<=n; i++){
			int c = a+ b;
			a = b;
			b = c;
		}
	}
	public void run(){

	}
}
