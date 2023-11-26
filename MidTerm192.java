import acm.program.ConsoleProgram;

public class MidTerm192 extends ConsoleProgram{
	public void run(){
		int count = 0;
		int k = readInt();
		while(k != 0){
			k = k / 10;
			count++;
		}
		for(int i = 1; i < count; i++){
			println(i + "" + k % 10);
		}
	}
}
