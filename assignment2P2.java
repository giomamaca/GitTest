import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P2 extends GraphicsProgram{
	private static final double R1 = 72;
	private static final double R2 = 48;
	private static final double R3 = 24;
	public void run(){
		GOval largeOval = new GOval (R1, R1);
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		
		add(largeOval, x, y);
	}
}
