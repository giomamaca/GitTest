import acm.program.ConsoleProgram;

public class Practice30 extends ConsoleProgram{
	public void run(){
		int k = readInt();
		int a = 0;
		while(k != 0){
			a = k % 10 * 10;
		}
		if(k == 0){
			a = a / 10;
		}
		print(a);
	}
}