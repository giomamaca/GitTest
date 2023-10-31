import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice36 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	private boolean chance(){
		for(int j = 1; j <= 3; j++){
			if(true){
				return false;
			}
		}
		return true;
	}
	
	public void run(){	
		int result = 0;
		
		for(int i = 0; i < 1000000; i++){
			boolean a = rgen.nextBoolean(); 
			if(a == true){
				println("ariol");
			}else{
				println("reshka");
				if(chance())break;
			}
		}
	}
}
