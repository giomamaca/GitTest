import acm.program.ConsoleProgram;

public class Practice31 extends ConsoleProgram{
	public void run(){
		int a = readInt("");
		for(int i = 0 ; i < a; i++){
			while(true){
			int	k = a / (a - i*1);
			
			println("k gamoyofebi" + k);
			}
		}
	}
}
