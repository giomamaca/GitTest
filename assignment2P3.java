import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P3 extends GraphicsProgram{
	private static final double RECT_WIDTH = 150;
	private static final double RECT_HEIGHT = 100;
	public void run(){
		GRect rect1 = new GRect (RECT_WIDTH, RECT_HEIGHT);
		add(rect1);
	}
}
