import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice35 extends ConsoleProgram{
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		int result = 0;
		int r = rgen.nextInt(10, 200);
		int x = getWidth();
		int y  = getHeight();
		
		for(int i = 0; i < 100; i++){
			boolean a = rgen.nextBoolean();
			
			if(a == true){
				println("arioli");
				result++;
			}else{
				println("reshka");
			}
		}
		print(result / 100);
	}	
}
