import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	private void milion(){
		int result = 0;
		for(int i = 1; i <= 100; i++){
			for(int j = 1; j <= i; i++){
				if(i % j == 0){
					result ++;
				}
				if(result == 2){
					print(i);
				}
			}
		}
	}
	
	public void run(){
		milion();
	}
}
