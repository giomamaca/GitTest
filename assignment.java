import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class assignment extends GraphicsProgram{
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;
	private static final int PADDLE_Y_OFFSET = 30;
	private static final int NBRICKS_PER_ROW = 10;
	private static final int NBRICK_ROWS = 10;
	private static final int BRICK_SEP = 4;
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;
	private static final int BRICK_HEIGHT = 8;
	private static final int BALL_RADIUS = 10;
	private static final int BRICK_Y_OFFSET = 70;
	private static final int NTURNS = 3;
	private static final int RADIUS = 10;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double vx = rgen.nextDouble(1.0, 3.0);
	private double vy = rgen.nextDouble(1.0, 3.0);
	private GOval ball;
	private GRect paddle;
	
	public void run(){
		paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		addMouseListeners();
		for(int i = 0; i < NBRICK_ROWS; i++){
			for(int j = 0; j < NBRICK_ROWS; j++){
				Bricks(i, j);
			}
		}
		movingBall();
	}

	
	public void mouseMoved(MouseEvent e) {
			paddle.setLocation(e.getX() - PADDLE_WIDTH / 2, getHeight() - 50);
			add(paddle);	
	}



	private void movingBall() {
		ball = new GOval (paddle.getX() - PADDLE_WIDTH / 2,getHeight() - 50, RADIUS, RADIUS);
		ball.setFilled(true);
		add(ball);
		while(true){			
			ball.move(vx, vy);
			pause(10);
			if(ball.getX() > APPLICATION_WIDTH - RADIUS / 2){
				vx *= -1;
			}
			if(ball.getX() < 0){
				vx *= -1;
			}
		}
	}

	private void Bricks(int i, int j) {
		int Xcord = (int)(i*(BRICK_WIDTH + BRICK_SEP));
		int Ycord = (int)(j*(BRICK_HEIGHT + BRICK_SEP));
		GRect Bricks = new GRect (Xcord + 2, Ycord, BRICK_WIDTH, BRICK_HEIGHT);
		Bricks.setFilled(true);
		Bricks.setColor(Color.red);
		add(Bricks);
	}
}
