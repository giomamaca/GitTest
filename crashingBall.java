import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class crashingBall extends GraphicsProgram {

	private static final double WIDTH = 50;
	private static final double HEIGHT = 200;

	public void run() {
		GOval ball = new GOval(0, getHeight() / 2, 10, 10);
		add(ball);
		GRect block = new GRect(700, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
		block.setFilled(true);
		block.setColor(Color.red);
		GObject cord1 = getElementAt(650, getWidth()- 100);
		GObject coed2 = getElementAt(650, 500);
		
		add(block);
		while (true) {
			GObject hitPad1 = getElementAt(ball.getX(), ball.getY() + 2 * );
			GObject hitPad2 = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS);
			GObject hitPad3 = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY());
			GObject hitPad4 = getElementAt(ball.getX(), ball.getY());
			ball.move(1, 0);
			pause(10);
		}

	}
}
