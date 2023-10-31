import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	
	public void run(){	
		int count = 0 ;
		int result = 0;
		
		for(int i = 0; i < 1000000; i++){
			boolean a = rgen.nextBoolean(); 
			if(a == true){
				println("ariol");
				count++;
			}else{
				println("reshka");
				count++;
			}
		}
	}
}
