import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class assignment2P2 extends GraphicsProgram{
	private static final double R1 = 72;
	private static final double R2 = 48;
	private static final double R3 = 24;
	public void run(){
		GOval largeOval = new GOval (R1, R1);
		double x = getWidth() / 2 - 36;
		double y = getHeight() / 2 - 36;
		largeOval.setFilled(true);
		largeOval.setColor(Color.RED);
		add(largeOval, x, y);
		
		GOval medOval = new GOval (R2, R2);
		double x1 = getWidth() / 2 - 36;
		double y1 = getHeight() / 2 - 36 ;
		medOval.setFilled(true);
		medOval.setColor(Color.WHITE);
		add(medOval);
	}
}
