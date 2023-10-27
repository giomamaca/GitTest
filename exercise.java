import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram{	
	public void run(){
		int a = 8;
		for(int i = 0; i < a; i++){
			if(a > 0){
				a *= i;
				print(a);
			}
		}
	}
}
