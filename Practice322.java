import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	public void run(){
		for(int i = 1; i <= 100; i++){
			int result = 0;
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
}
