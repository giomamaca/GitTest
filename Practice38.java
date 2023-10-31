import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice38 extends ConsoleProgram{
	
	RandomGenerator rGen = new RandomGenerator();
	
	public void run(){
		int bount = 1000;
		int a = rGen.nextInt(0, 36);
		int money = readInt();
		int k = readInt("enter num = ");
		
		while(bount != 0){
			for(int i = 0; true; i++){
				boolean num = rGen.nextBoolean();
				
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
