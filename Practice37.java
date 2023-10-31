import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice37 extends ConsoleProgram{
	
	RandomGenerator rGen = new RandomGenerator();
	
	public void run(){
		int bount = 100;
		
		for(int i = 0; true; i++){
			boolean a = rGen.nextBoolean();
			
			if(bount != 0){
				if(a == true){
					println("blue");
					bount = bount + 20;
					println("you win: " + bount); 
				}else{
					println("red");
					bount = bount - 20;
					println("you lose: " + bount);
				}
			}
		}
	}
}
