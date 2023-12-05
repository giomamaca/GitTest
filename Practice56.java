import acm.program.ConsoleProgram;

public class Practice56 extends ConsoleProgram{
	public void run(){
		int n = readInt();
		
		int[] arr;
		
		arr = new int[n];
		
		for(int i = 0; i < arr.length; i++){
			int k = readInt();
			println("arr#" + i + "[" + k + "]");
		}
	}
}
