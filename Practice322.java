import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	public void run(){
		addSimples();
	}
	
	private int numDivisors(int i){
		int result = 0;
		for(int j = 1; j <= 100; j++){
			if(i % j == 0){
				result ++;
			}
		}
		return result;
	}
	
	private void addSimples() {
		for(int i = 1; i <= 100; i++){
			int divisors = numDivisors(i);
			
			if(divisors == 2){
				println("" + i);
			}
		}
	}
}
