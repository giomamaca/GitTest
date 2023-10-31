import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice37 extends ConsoleProgram{
	
	RandomGenerator rGen = new RandomGenerator();
	
	public void run(){
		int bount = 1000; 
		
		boolean a = rGen.nextBoolean();
		
		for(int i = 0; true; i++){
			if(bount != 0){
				if(a == true){
					bount = bount + 50;
					println("you win: " + bount); 
				}else{
					bount = bount - 50;
					println("you lose: " + bount);
				}
			}
		}
	}
}
