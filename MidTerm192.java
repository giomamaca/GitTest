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
		int half = count / 2;
		int swap = 1;
		int a = 1;
		while(half != 0){
			a *= 10;
			half--;
		}
		if(count % 2 == 0){
			int div1 = n % a;
			int div2 = n / a;			
			while(div2 != 0){
				swap = swap * 10 + n % 10;
				div2 = div2 / 10;
			}		
			println(div1);
			println(swap);
			if(div1 == swap){
				println("correct");
			}else{
				println("wrong");
			}
		}
		if(count % 2 == 1){
			int div1 = n % a;
			int div2 = n / (a*10);			
			while(div2 != 0){
				swap = swap * 10 + div2 % 10;
				div2 = div2 / 10;
			}
			println(div1);
			println(swap);
			if(div1 == swap){
				println("correct");
			}else{
				println("wrong");
			}
		}
	}
}
