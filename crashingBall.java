import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class crashingBall extends GraphicsProgram{
	
	private GOval ball;
	
	public void run(){
		ball = new GOval (getWidth() / 2, getHeight() / 2, 10, 10);
		addMouseListeners();
	}
	public void mouseMoved(MouseEvent e){
		while(true){
			ball.move(1, 0);			
			pause(10);
		}
	}
}
