import acm.program.ConsoleProgram;

public class Practice27 extends ConsoleProgram{
	public void run(){
		int answer = 1;
		double n = readDouble("");
		int m = readInt("");
		for(int i = 1; i <= m; i++){
			answer *= n;
		}
		print(answer);
	}
}
