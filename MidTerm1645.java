import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MidTerm1645 extends GraphicsProgram {

	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 50;
	private final static int DELAY = 2000;

	private int count = 0;
	private GOval ball;
	private GOval oval;
	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		addMouseListeners();
		drawCircle();
		pause(DELAY);
		while (getElementCount() != 0 && getElementCount() <= CIRCLE_NUM) {
			drawCircle();
			pause(DELAY);
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) != null) {
			count++;
			oval = ball;
			if (count == 3) {
				remove(oval);
				count = 0;

			}
		}
	}

	private void drawCircle() {
		ball = new GOval(rgen.nextInt(0, getWidth() - CIRCLE_D), rgen.nextInt(0, getHeight() - CIRCLE_D), CIRCLE_D / 2,
				CIRCLE_D / 2);
		ball.setFilled(true);
		add(ball);
	}
}
