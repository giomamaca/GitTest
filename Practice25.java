import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	
	private int gcd(int a, int b){
		while(a % b != 0 && a != 0){
			a %= b;
		}
	}
	
	public void run(){

	}
}
