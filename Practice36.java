import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){			
		for(int i = 0; i < 100; i++){
			boolean a = rgen.nextBoolean(); 
			if(a == true){
				println("ariol");
			}else{
				println("reshka");
			}
		}
	}
}
