import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.paint.Color;

public class MidTerm193 extends GraphicsProgram {
	private final int CIRCLE_D = 100;
	private final int DELAY = 100;
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
		}else{
			if(obj == null){
				obj = (GOval) o;
			}
		}
	}

	private Color randomColor() {
		int a = rgen.nextInt(5);
		if (a == 0) {
			return Color.GREEN;
		} else if (a == 1) {
			return Color.RED;
		} else if (a == 2) {
			return Color.BLUE;
		} else if (a == 3) {
			return Color.BLACK;
		}
			return Color.YELLOW;
	}
}