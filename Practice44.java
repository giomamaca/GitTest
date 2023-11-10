import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Practice44 extends GraphicsProgram {

	private static final double BALL_SIZE = 50;

	private GOval oval;

	public void run() {
		addMouseListeners();
		initBall();
		dropBall();
	}

	private void initBall() {
		oval = new GOval(BALL_SIZE, BALL_SIZE);
		add(oval);
	}

	private void dropBall() {
		while (true)
			oval.move(0, 1);
	}


	private void mouseClicked(MouseEvent e) {
		oval.setLocation(e.getX() - oval.getWidth() / 2, e.getY() - oval.getHeight() / 2);
	}
}
