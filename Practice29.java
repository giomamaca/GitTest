import acm.program.ConsoleProgram;

public class Practice29 extends ConsoleProgram{
	private int fibonacci(int n){
		int a = 1, b = 1;
		for(int i = 0; i<=n; i++){
			int c = a+ b;
			a = b;
			b = a;
		}
		return b;
	}
	public void run(){
		int a = readInt("a = ");
		int b = readInt("b = ");
		println(fibonacci(a));
	}
}
