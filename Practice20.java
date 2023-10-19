import acm.program.ConsoleProgram;

public class Practice20 extends ConsoleProgram {
	public void run(){
		int n = readInt("enter number:");
		
		
		for(int i = 0; i < n; i++){
			int num = readInt("enter number #" + i + ":");
			
			println(num);
		}
	}
}