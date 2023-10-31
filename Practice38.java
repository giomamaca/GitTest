import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice38 extends ConsoleProgram{
	
	RandomGenerator rGen = new RandomGenerator();
	
	public void run(){
		int bount = 1000;
		int money = readInt("prise = ");
		
		for(int i = 0; i < 100000; i++){
			int k = readInt(0, 36);
			println("enter num = " + k);
			int a = rGen.nextInt(0, 36);
			println("" + a);
				
			
			if(a == k){
				bount = bount  + money;
				println("you won : " + bount);
			}
			if(a != k ){
				bount = bount - money;
				println("you lost : " + bount);
			}
		}
		println("your bount = " + bount);
	}
}
