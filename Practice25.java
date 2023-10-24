import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	public void run(){
		int answer = 1;
		int a = readInt ("enter a = ");
		int b = readInt ("enter b = ");
		for(int i = 0; true; i += a){
			while (a != b){
				answer += b;
			    answer += a;
			}
			print(answer);
		}
	}
}
