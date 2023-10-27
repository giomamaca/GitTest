import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{		
	public void run(){
		int n = readInt("");
		int k = 0;
		for(int i = 0; i<(n / 2); i++){
			if(n % i == 0){
				n = n /1; 
				k++;
				println("dsdsd" + k);
			}
		}
	}
}
