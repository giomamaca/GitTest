import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
//	private int divisors(int a){
//		for(int i = 1; i <= a; i++){
//		}
//		return 0;
//	}
	
	private void milion(){
		int result = 0;
		int k = 10;
		for(int j = 1; j < k; j++){
			if(k % j == 0){
				result++;
			}
			while(result == 2){
				print(j);
			}
		}
	}
	
	public void run(){
		milion();
	}
}
