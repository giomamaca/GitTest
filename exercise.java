
import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram{	
	private int max(int num1,int num2){
		if(num1>=num2){
			return num1;
		}
		return num2;
	}
	public void run(){
		int larger = max(5, 1);
		print(larger);
	}
}