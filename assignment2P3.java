import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P3 extends GraphicsProgram{
	private static final double RECT_WIDTH = 150;
	private static final double RECT_HEIGHT = 75;
	public void run(){
		GRect rect1 = new GRect (RECT_WIDTH, RECT_HEIGHT);
		double x = getWidth() / 2 - RECT_WIDTH / 2;
		double y = getHeight() / 5;
	    add(rect1, x, y);
	    
	    GLabel label1 = new GLabel (CENTER, 60, 60);
	    double xLabel = getWidth() / 2 - RECT_WIDTH / 2 ;
	    double yLabel = getHeight() / 5;
	    add(label1, xLabel, yLabel);
	}
}
