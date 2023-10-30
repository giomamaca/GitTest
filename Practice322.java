import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	private int numDivisors(int i){
		int result = 0;
		for(int j = 0; j < i; j++){
			if(i % j == 0){
				result ++;
			}
		}
		return result;
	}
	
	public void run(){
		addSimples();
	}
	private void addSimples() {
		for(int i = 0; i < 100; i++){
			int divisors = numDivisors(i);
			
			if(divisors == 2){
				print(i);
			}
		}
	}
}
