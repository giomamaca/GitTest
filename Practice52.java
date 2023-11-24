import acm.program.ConsoleProgram;

public class Practice52 extends ConsoleProgram{
	public void run() {
		int n = readInt("number of nums = ");
		int biggest = readInt("num = ");
		int secondBiggest = readInt("num = ");
		if(secondBiggest > biggest){
			int a =  secondBiggest;
			secondBiggest = biggest;
			biggest = a;
		}
		
		for(int i = 0; i < n-2; i++){
			int num = readInt("num = ");
			if(num > biggest){
				int temp = biggest;
				biggest = num;
				secondBiggest = temp;
			}
			if(num > secondBiggest){
				secondBiggest = num;
			}
		}
		println(biggest);
		println(secondBiggest);
	}
}
