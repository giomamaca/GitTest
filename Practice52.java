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
			small = num;
			if(small < num){
				large = small;
			}
			if(large < num){
				large =num;
			}
		}
		println(large);
		println(small);
	}
}
