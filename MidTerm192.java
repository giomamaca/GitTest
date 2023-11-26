import acm.program.ConsoleProgram;

public class MidTerm192 extends ConsoleProgram{
	public void run(){
		int count = 0;
		int swap = 0;
		int k = readInt();
		int n = k;
		int a = k;
		while(k != 0){
			k = k / 10;
			count++;
		}
		int div1 = n % (10 * count / 2);
		int div2 = a / (10 * count / 2);
		while(div2 != 0){
			swap = swap + (n % 10) *10;
		}
		swap = swap / 10;
				
		print(swap);
		if(div1 == swap){
			println("correct");
		}else{
			println("wrong");
		}
	}
}
