import acm.program.*;
import acm.graphics.*; 

public class BouncingBall extends GraphicsProgram{
	
	private static final double DIAM = 30;
	private static final double GRAVITY = 0.1;
	private double X = 5;
	
	public void run(){
		GOval ball = new GOval (DIAM, DIAM);
		ball.setFilled(true);
		add(ball);
		
		while(ball.getX() > getWidth() - DIAM){
			ball.move(X, 5);
		}
	}
}
