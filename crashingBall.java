import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class crashingBall extends GraphicsProgram{	
	
	private static final double WIDTH = 50;
	private static final double HEIGHT = 200;
	
	public void run(){
		GOval ball = new GOval (0, getHeight() / 2, 10, 10);
		add(ball);
//		while(true){
//			ball.move(1, 0);			
//			pause(10);			
//		}
		
		GRect block = new GRect (700, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
		add(block);
	}
}
