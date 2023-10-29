import acm.program.ConsoleProgram;

public class Practise32 extends ConsoleProgram{
	
	public void run(){
		int a = readInt("enter a= ");
		for(int i = 1; i <= a; i++){
			println("");
			int result = 0;
			int n = readInt("enter n = ");
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					result++;
				}
			}
			if(result == 2){
				print(i);
			}
		}
	}
}
