import acm.program.ConsoleProgram;

public class Practice56 extends ConsoleProgram{
	public void run(){
		int n = readInt();
		int [] num = new int[n];
		for(int i = 0; i < num.length; i++){
			num[i] = readInt();
			
		}
		println(num);
	}
}
