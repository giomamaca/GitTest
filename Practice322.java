import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	public void run(){
		addSimples();
	}
	
	private void addSimples() {
		for(int i = 1; i <= 1000000; i++){
			int divisors = numDivisors(i);;
			
			if(divisors == 2){
				println("num = " + i);
			}
		}
	}
	private int numDivisors(int i){
		int result = 0;
		
		for(int j = 1; j <= 1000000; j++){
			if(i % j == 0){
				result += 1;
			}
		}
		return result;
	}
}
