import acm.program.*;
import acm.graphics.*; 

public class BouncingBall extends GraphicsProgram{
	
	private static final double DIAM = 30;
	private static final double GRAVITY = 0.1;
	private double X = 5;
	private double Y = 5; 
	private GOval ball;
	
	public void run(){
		setup();
		while(ball.getX() > getWidth() - DIAM){
			moveBall();
		}
	}

	private void moveBall() {
		ball.move(X, Y);
		pause(50);
	}

	private void setup() {
		ball = new GOval (DIAM, DIAM);
		ball.setFilled(true);
		add(ball);
	}
}
