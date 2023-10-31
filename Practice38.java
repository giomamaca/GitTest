import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice38 extends ConsoleProgram{
	
	RandomGenerator rGen = new RandomGenerator();
	
	public void run(){
		int bount = 1000;
		int money = readInt("prise = ");
		int k = readInt("enter num = ");
		
		if(bount != 0){
			for(int i = 0;true ; i++){
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
	}
}
