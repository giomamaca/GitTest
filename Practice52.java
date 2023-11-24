import acm.program.ConsoleProgram;

public class Practice52 extends ConsoleProgram{
	public void run(){
		int count = 0;
		int n = readInt("enter num of numbers : ");
		int large = 0;
		int small = 0;
		while(true){
			int num = readInt("num = ");
			count++;
			if(count == n) break;
			if(num > large){
				large = num;
			}
			num = small;
			if(small < large){
				large = small;
			}
		}
		print(large);
		print(small);
	}
}
