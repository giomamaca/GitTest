import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {
	public void run() {
		GOval Ball = new GOval (0, getHeight() / 2, 18, 18);
		Ball.setFilled(true);
		add(Ball);
		
		while(Ball.getX() < getWidth() / 2){
			Ball.move(1, 1);
			pause(10);
		}
	}
}
