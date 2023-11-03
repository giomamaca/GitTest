import acm.program.ConsoleProgram;

public class Practice26 extends ConsoleProgram{
	
	private int GCM(int a, int b){
		int divisor = 0;
		for(int i = 1; i < a; i++){
			if(a % i == 0 & b % i == 0){
				divisor = i;
			}
		}
		return divisor;
	}
	
	public void run(){
		int a = readInt();
		int b = readInt();
		print(GCM(a, b));
	}
}
