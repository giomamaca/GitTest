import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class crashingBall extends GraphicsProgram{	
	public void run(){
		GOval ball = new GOval (getWidth() / 2, getHeight() / 2, 10, 10);
		add(ball);
		ball.move(1, 0);			
		pause(10);
	}
}
