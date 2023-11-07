import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SpiningBall extends GraphicsProgram {

	private int x = 1;
	private int y = 1;

	public void run() {
		GOval Ball = new GOval(0, getHeight() / 2, 18, 18);
		Ball.setFilled(true);
		add(Ball);

		while (true) {
			Ball.move(x, y);
			pause(10);

			for (int i = 0; i < 10; i++) {
				x = x + i * (1 / 10);
				y = y + i * (1 / 10);
			}
		}
	}
}
