import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice38 extends ConsoleProgram{
	
	RandomGenerator rGen = new RandomGenerator();
	
	public void run(){
		int bount = 100;
		int money = readInt("prise = ");
		int k = readInt("enter num = ");
		
		while(bount != 0){
			if(true){
				int a = rGen.nextInt(0, 36);
				println("" + a);
			
				if(a == k){
					bount = bount  + money;
				}
				if(a != k ){
					bount = bount - money;
				}
			}
		}
		println("your bount = " + bount);
	}
}
