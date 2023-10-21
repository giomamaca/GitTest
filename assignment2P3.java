import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P3 extends GraphicsProgram{
	private static final double RECT_WIDTH = 150;
	private static final double RECT_HEIGHT = 75;
	private static final double MIDLINE_WIDTH = 150;
	public void run(){
		GRect rect1 = new GRect (RECT_WIDTH, RECT_HEIGHT);
		double x = getWidth() / 2 - RECT_WIDTH / 2;
		double y = getHeight() / 5;
	    add(rect1, x, y);
	    
	    GRect rect2 = new GRect (RECT_WIDTH, RECT_HEIGHT);
	    double x1 = getWidth() / 2 - RECT_WIDTH / 2;
	    double y1 = getHeight() / 5 + MIDLINE_WIDTH;
	    add(rect2, x1, y1);
	}
}
