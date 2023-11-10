import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SpiningBall extends GraphicsProgram {

	private static final double DIAM = 30;
	private static final double BOUNCE_REDUCE = 0.9;
	private static final double X_START = DIAM / 2;
	private static final double Y_START = 100;
	private double GRAVITY = 0.1;
	private double X = 5;
	private double Y = 0;
	private GOval ball;

	public void run() {
		setup();
		while(ball.getX() < getWidth()){
			moveBall();
			Check();
			pause(50);
		}
	}


	private void Check() {
		if(ball.getY() < getHeight() - DIAM){
			Y = -Y * BOUNCE_REDUCE;
			double diff = ball.getY() - (getHeight() - DIAM);
			ball.move(0, -2 * diff);
		}
	}


	private void moveBall() {
		Y += GRAVITY;
		ball.move(X, Y);
		
	}


	private void setup() {
		ball = new GOval (DIAM, DIAM);
		ball.setFilled(true);
		add(ball);
	}
}
