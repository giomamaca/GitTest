import acm.program.ConsoleProgram;

public class Practise32 extends ConsoleProgram{
	public void run(){
		int result = 0;
		int a = readInt("enter a = ");
		for(int i = 0; i <= a; i++){
			for(int j = 0; j <= i; j++){
				if(i % j == 0){
					result++;
					print(result);
				}
			}
		}
	}
}
