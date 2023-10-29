import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	private boolean simple(int k){
		if(k == 1) return false;
		for(int i = 0; i <= k; i++){
			if(k % i == 0){
				print(i);
			}
		}
	}
	
	public void run(){
		
	}
}
