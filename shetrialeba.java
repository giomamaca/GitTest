import acm.program.ConsoleProgram;

public class shetrialeba extends ConsoleProgram{
	
	private int turnNum(int a){
		int k = 0;
		while(a > 0){
			k = k*10 + a % 10;
			a = a / 10;
		}
		return k;
	}
	
	public void run(){
		int c = readInt();
		println(turnNum(c));
	}
}
