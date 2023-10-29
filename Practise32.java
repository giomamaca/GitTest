import acm.program.ConsoleProgram;

public class Practise32 extends ConsoleProgram{
	
	public void run(){
		int result = 0;
		int n = readInt("");
		for(int i = 1; i <= n; i ++){
			for(int j = 1; j <= i; j++){
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
