import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice43 extends GraphicsProgram{
	private static final double RADIUS = 10;
	private GOval circle;
	public void run(){
		circle = new GOval (2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
	}
}
