import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice35 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		
		int r = rgen.nextInt(10, 200);
		int x = getWidth();
		int y  = getHeight();
		
		boolean a = rgen.nextBoolean();
		
		if(a){
			println("arioli");
		}else{
			println("reshka");
		}
	}	
}
