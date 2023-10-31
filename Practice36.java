import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){			
		for(int i = 0; i < 1000000; i++){
			int result = 0;
			boolean a = rgen.nextBoolean(); 
			if(a == true){
				println("ariol");
				result ++;
			}else{
				println("reshka");
			}
			if(result == 3){
				break;
			}
		}
	}
}
