import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.paint.Color;

public class MidTerm193 extends GraphicsProgram {
	private final static int CIRCLE_D = 100;
	private final static int DELAY = 100;
	private final static int N_COLORS = 5;
	RandomGenerator rgen = new RandomGenerator();
	
	private GOval oval;
	private GObject obj = null;

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		
		GObject o = getElementAt(x, y);
		
		if(o == null){			
			oval = new GOval (x - CIRCLE_D / 2, y - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
		}
		if(o != null){
			obj = o;
			while(obj.getColor() != java.awt.Color.GREEN){				
				obj.setColor(randomColor());
				pause(1000);
			}
		}
	}

	private java.awt.Color randomColor() {
		int a = rgen.nextInt(N_COLORS);
		if (a == 0) {
			return java.awt.Color.GREEN;
		} else if (a == 1) {
			return java.awt.Color.RED;
		} else if (a == 2) {
			return java.awt.Color.BLUE;
		} else if (a == 3) {
			return java.awt.Color.BLACK;
		}
			return java.awt.Color.YELLOW;
	}
}