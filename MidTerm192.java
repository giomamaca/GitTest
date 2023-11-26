import acm.program.ConsoleProgram;

public class MidTerm192 extends ConsoleProgram{
	public void run(){
		int count = 0;
		int k = readInt();
		int n = k;
		while(k != 0){
			k = k / 10;
			count++;
		}
		int divider1 = 0;
		int divider2 = 0;
		for(int i = 1; i < count; i++){
			int div1 = n % (10 * i);
			divider1 = div1;
			for(int j = count; j > 0; j++){
				int div2 = n / 10 * j; 
				divider2 = div2;
			}
		}
		if(divider1 == divider2){
			println("correct");
		}
	}
}
