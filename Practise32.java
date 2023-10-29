import acm.program.ConsoleProgram;

public class Practise32 extends ConsoleProgram{
	public void run(){
		int result = 0;
		int a = readInt("enter a = ");
		for(int i = 0; i <= a; i++){
			if(a % i == 0){
				result++;
			}
		}
	}
}
