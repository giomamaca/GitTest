import acm.program.ConsoleProgram;

public class Practice26 extends ConsoleProgram{
	
	private int gcd(int a, int b){
		while(a != b){
			for(int i = 0; i < a; i++){
				if(a > 0){
					a *= i;
					print(a);
				}
			}
		}
	}
	
	public void run(){
		
	}
}
