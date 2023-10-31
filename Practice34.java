import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice34 extends GraphicsProgram{
	public void run(){
		int r = rgen.nextInt (10, 500);
		int x = getWidth();
		int y = getHeight();
		Color color = rgen.nextColor();
		GOval oval = new GOval(x/ 2 - r / 2, y / 2 - r / 2, r, r);
		oval.setFilled(true);
		oval.setColor(color);
		add(oval);
		
		}
	
	RandomGenerator rgen = new RandomGenerator() ;
}
