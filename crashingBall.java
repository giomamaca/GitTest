import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class crashingBall extends GraphicsProgram{	
	public void run(){
		GOval ball = new GOval (0, getHeight() / 2, 10, 10);
		add(ball);
		while(true){
			ball.move(1, 0);			
			pause(10);			
		}
	}
}
