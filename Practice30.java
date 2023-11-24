import acm.program.ConsoleProgram;

public class Practice30 extends ConsoleProgram{
	public void run(){
		int k = 0;
		int a = readInt("?");
		while(a > 0){
			k = k * 10 + k % 10;
			a = a / 10;
		}
		print(k);
	}
}