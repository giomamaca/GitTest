import acm.program.ConsoleProgram;

public class Practice52 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int biggest = readInt();
		int secondBiggest = readInt();
		if(secondBiggest > biggest){
			int a =  secondBiggest;
			secondBiggest = biggest;
			biggest = a;
		}
		
		for(int i = 0; i < n-2; i++){
			int num = readInt();
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
