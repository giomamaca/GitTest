import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		for(int i = 0; i < 15; i++){
			int result = 0;
			boolean a = rgen.nextBoolean(); 
			if(a == true){
				result++;
				if(result != 4){
					println("ariol");
				}else{
					break;
				}
			}else{
				println("reshka");
			}
		}
	}
}
