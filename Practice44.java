import acm.program.GraphicsProgram;

import java.awt.Component;

import com.sun.glass.events.MouseEvent;

import acm.graphics.GOval;
import acm.program.*;

public class Practice44 extends GraphicsProgram{
	
	private static final double BALL_SIZE = 50;
	
	private GOval oval;
	
	public void run(){
		addMouseListeners();
		initBall();
		dropBall();
	}
	
	private void initBall(){
		oval = new GOval (BALL_SIZE, BALL_SIZE);
		add(oval);
	}
	
	private void dropBall(){
		oval.move(0, 1);
		pause(10);
	}

	private void mouseClicked(MouseEvent e) {
		oval.setLocation( oval.getWidth() / 2, oval.getHeight() / 2);
	}
}
