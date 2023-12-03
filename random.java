import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class random extends GraphicsProgram{
	
	private static final double MIN_RADIUS = 30;
	private static final double MAX_RADIUS = 80;
	private GOval oval;
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		addMouseListeners();
		double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		double coordX = rgen.nextDouble(0, getWidth() - radius);
		double coordY = rgen.nextDouble(0, getHeight() - radius);
		
		for(int i = 0; i < 25; i++){
			oval = new GOval(coordX, coordY, radius, radius);
			oval.setFilled(true);
			add(oval);
		}
	}
}
