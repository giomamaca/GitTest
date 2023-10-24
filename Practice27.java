import acm.program.ConsoleProgram;

public class Practice27 extends ConsoleProgram{
	public void run(){
		int answer = 1;
		double n = readDouble ("enter n = ");
		int m = readInt ("eneter m = ");
		for(int i = 0; i < m; i++){
			answer *= n;
			print(answer);
		}
	}
}
