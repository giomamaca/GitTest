import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.paint.Color;

public class MidTerm193 extends GraphicsProgram {
	private final int CIRCLE_D = 100;
	private final int DELAY = 100;
	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		drawCircle();
		addMouseListeners();
	}

	private void drawCircle() {
		GOval oval = new GOval (CIRCLE_D, CIRCLE_D);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval);
	}

	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		
		drawCircle();
		if(getElementAt(x, y) != null){
			
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