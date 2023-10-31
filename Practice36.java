import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		int result = 0;
		for(int i = 0; i < 100; i++){
			boolean a = rgen.nextBoolean(); 
			if(a == true){
				result++;
				if(result == 3){
					break;
				}
			}else{
				println("reshka");
			}
		}
	}
}
