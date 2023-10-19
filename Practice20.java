import acm.program.ConsoleProgram;

public class Practice20 extends ConsoleProgram {
	public void run(){
		int n = readInt("enter number:");
		
		int sum = 0;
		for(int i = 0; i < n; i++){
			int num = readInt("enter number #" + i + ":");
			
//			println(num);
			sum += num;
		}
		print("sum:" + sum);
	}
}