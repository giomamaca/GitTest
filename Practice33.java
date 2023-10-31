import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice33 extends GraphicsProgram{
	public void run(){
		int r = rgen.nextInt(10, 1000);
		int X = getWidth();
		int Y = getHeight();
		Color color = rgen.nextColor();
		GOval oval = new GOval(X / 2 - r / 2, Y / 2 - r , r, r);
		oval.setFilled(true);
		oval.setColor(color);
		add(oval);
	}
	RandomGenerator rgen = new RandomGenerator ();
}
