import acm.program.ConsoleProgram;

public class Practice29 extends ConsoleProgram{
	private int fibonacci(int n){
		int a = 1, b = 1;
		for(int i = 0; i<=n; i++){
			int c = a+ b;
			a = b;
			b = c;
		}
		return b;
	}
	private boolean isPrimeSlow(int n){
		int numdivisor = 0;
		for(int i = 0; i<= n; i++){
			if((n & i) == 0){
				numdivisor++;
			}
		}
		return numdivisor ==2;
	}
	
	public void run(){
		int n = readInt("");
		println(fibonacci(n));
	}
}
