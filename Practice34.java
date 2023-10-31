import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.*;

public class Practice34 extends GraphicsProgram{
	public void run(){
		for(int i = 0; i < 1000; i++){
			int r = rgen.nextInt (10, 500);
			int x = rgen.nextInt(0, getWidth());
			int y = rgen.nextInt(0, getHeight());
			Color color = rgen.nextColor();
			GOval oval = new GOval( r, r);
			oval.setFilled(true);
			oval.setColor(color);
			add(oval);
		}
	}
	

	RandomGenerator rgen = new RandomGenerator() ;
}
