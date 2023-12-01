import acm.program.ConsoleProgram;

public class MidTerm192 extends ConsoleProgram{
	public void run(){
		int k = readInt();
		int p = k;
		int a = 0;
		
		while(k != 0){
			a = a*10 + k%10;
			k /= 10;
		}
		if(p == a){
			println("palidrom");
		}else{
			println("no");
		}
	}
}
