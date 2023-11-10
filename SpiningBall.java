import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SpiningBall extends GraphicsProgram {

	private double GRAVITY = 0.1;

	public void run() {
		GOval ball = new GOval(60, 60);
		ball.setFilled(true);
		add(ball);

		double x = 1;
		double y = 1;

		while (true) {
			ball.move(x, y);
			pause(2);
			if (ball.getY() == getHeight()) {
				break;
			}
		}
	}
}
