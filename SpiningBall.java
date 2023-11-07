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
		}
	}
}
