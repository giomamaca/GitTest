import acm.program.GraphicsProgram;

import java.awt.Component;

import com.sun.glass.events.MouseEvent;

import acm.graphics.GOval;
import acm.program.*;

public class Practice41 extends GraphicsProgram{
	
	private GOval ball;
	
	public void run(){
		addMouseListeners();
		PaintBall();
	}

	private void PaintBall() {
		
	}
	
	public void mouseMoved(MouseEvent e){
		add(ball);
	}
}
