import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {	
	public void run() {
		GOval Ball = new GOval (0, getHeight() / 2, 18, 18);
		Ball.setFilled(true);
		add(Ball);
		
		while(Ball.getX() < getWidth() / 2 && Ball.getY() != getHeight() - 18){
			Ball.move(1, 0);
			pause(5);
		}
		while(Ball.getX() != Ball.getWidth() + 18){
			Ball.move(-1, 0);
			pause(5);
		}
	}
}
