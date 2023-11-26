import acm.program.ConsoleProgram;

public class MidTerm192 extends ConsoleProgram{
	public void run(){
		int count = 0;
		int k = readInt();
		int n = k;
		int a = k;
		while(k != 0){
			k = k / 10;
			count++;
		}
		int swap = 0;
		if(count % 2 == 0){
			int div1 = n % (10 ^ count / 2);
			int div2 = a / (10 ^ count / 2);			
			while(div2 != 0){
				swap = swap * 10 + n % 10;
				div2 = div2 / 10;
			}		
			println(div1);
			println(div2);
			if(div1 == div2){
				println("correct");
			}else{
				println("wrong");
			}
		}
		if(count % 2 == 1){
			int div1 = n % (10 ^ (count / 2));
			int div2 = a / (10 ^ ((count / 2) + 1));			
			while(div2 != 0){
				swap = swap * 10 + div2 % 10;
				div2 = div2 / 10;
			}
			println(div1);
			println(div2);
			if(div1 == swap){
				println("correct");
			}else{
				println("wrong");
			}
		}
	}
}
