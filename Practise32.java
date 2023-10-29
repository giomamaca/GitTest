import acm.program.ConsoleProgram;

public class Practise32 extends ConsoleProgram{
	
	private int milion(int n){
		int result = 0;
		for(int i = 1; i <= n; i ++){
			for(int j = 0; j <= i; j++){
				if(j % i == 0){
					result ++;
				}
				while(n > 0){
					if(result == 2){
						return i;
					}
				}
			}
		}
		return 0;
	}
	
	public void run(){
		int c = readInt("?");
		print(milion(c));
	}
}
