
/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class assignment extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double vx = rgen.nextDouble(1.0, 3.0);
	private double vy = rgen.nextDouble(1.0, 3.0);
	private GOval ball;
	private GRect paddle;
	private int point = 0;
	AudioClip bounceClip = MediaTools.loadAudioClip("bounce.au");

	private GObject getCollidingObject(double a, double b) {
		return getElementAt(a, b);
	}

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		// Create paddle
		paddle = new GRect(getWidth() / 2 - PADDLE_WIDTH / 2, getHeight() - PADDLE_Y_OFFSET, PADDLE_WIDTH,
				PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle);
		addMouseListeners();
		// Let's draw bricks
		for (int i = 0; i < NBRICK_ROWS; i++) {
			for (int j = 0; j < NBRICK_ROWS; j++) {
				Bricks(i, j);
			}
		}
		// Let's tell ball what it should do
		movingBall();
	}

	private void Losing() {
		if (ball.getY() > getHeight()) {
			removeAll();
			GLabel lose = new GLabel("YOU LOSE!");
			double TL1 = getWidth() / 2 - lose.getWidth() / 2;
			double TL2 = getHeight() / 2 - lose.getAscent() / 2;
			add(lose, TL1, TL2);
		}
	}

	private void ballHitsPaddle() {
		// Ball coordinates
		GObject hitPad1 = getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS);
		GObject hitPad2 = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS);
		GObject hitPad3 = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY());
		GObject hitPad4 = getElementAt(ball.getX(), ball.getY());
		// If ball will hit paddle it will be bounced
		if (hitPad1 == paddle || hitPad2 == paddle || hitPad3 == paddle || hitPad4 == paddle) {
			ball.setLocation(ball.getX(), getHeight() - PADDLE_Y_OFFSET - BALL_RADIUS * 2);
			vy = -vy;
			vy *= 1.01;
			vx *= 1.01;

		}
	}

	public void mouseMoved(MouseEvent e) {
		// Set paddle
		paddle.setLocation(e.getX() - PADDLE_WIDTH / 2, getHeight() - PADDLE_Y_OFFSET);
		// If paddle is on the right wall it will be stopped
		if (paddle.getX() > getWidth() - PADDLE_WIDTH) {
			paddle.setLocation(getWidth() - PADDLE_WIDTH, getHeight() - PADDLE_Y_OFFSET);
		}
		// If paddle is on the left wall it will be stopped
		if (paddle.getX() < 0) {
			paddle.setLocation(0, getHeight() - PADDLE_Y_OFFSET);
		}
	}

	private void movingBall() {
		// create ball
		ball = new GOval(getWidth() / 2 - BALL_RADIUS / 2, getHeight() / 2 - BALL_RADIUS / 2, BALL_RADIUS * 2,
				BALL_RADIUS * 2);
		ball.setFilled(true);
		add(ball);
		while (true) {
			// Ball moves with vx and vy
			ball.move(vx, vy);
			pause(7);
			// If ball hits right wall it will be bounced
			if (ball.getX() > APPLICATION_WIDTH - BALL_RADIUS * 2) {
				vx *= -1;
			}
			// If ball hits left wall it will be bounced
			if (ball.getX() < 0) {
				vx *= -1;
			}
			// If ball hits top wall it will be bounced
			if (ball.getY() < 0) {
				vy *= -1;
			}
			// Ball coordinates
			GObject collider1 = getCollidingObject(ball.getX(), ball.getY());
			GObject collider2 = getCollidingObject(ball.getX() + 2 * BALL_RADIUS, ball.getY());
			GObject collider3 = getCollidingObject(ball.getX(), ball.getY() + 2 * BALL_RADIUS);
			GObject collider4 = getCollidingObject(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS);
			GObject colliderCenter1 = getCollidingObject(ball.getX() + BALL_RADIUS, ball.getY());
			GObject colliderCenter2 = getCollidingObject(ball.getX() + 2 * BALL_RADIUS, ball.getY() + BALL_RADIUS);
			if (ball.getX() > 0) {
				if (collider1 != null || collider2 != null || collider3 != null || collider4 != null) {
						// If ball hits any brick it will be removed
						if (collider1 != null) {
							remove(collider1);
							bounceClip.play();
							point++;
						}
						if (collider2 != null) {
							remove(collider2);
							point++;
							bounceClip.play();
						}
						if (collider3 != null) {
							remove(collider3);
							point++;
							bounceClip.play();
						}
						if (collider4 != null) {
							remove(collider4);
							point++;
							bounceClip.play();
						}
						vy *= -1;
						if(vx < 0 && vy > 0){
							if(colliderCenter1 != null){								
								vx *= -1;
							}
						}
						if(vx > 0 && vy > 0){
							if(colliderCenter1 != null){								
								vx *= -1;
							}
						}
						
					// To not to remove paddle
					if (collider1 == paddle || collider2 == paddle || collider3 == paddle || collider4 == paddle
							|| colliderCenter1 == paddle || colliderCenter2 == paddle) {
						ball.setLocation(ball.getX(), ball.getY() - BALL_RADIUS);
						paddle = new GRect(paddle.getX(), paddle.getY(), PADDLE_WIDTH, PADDLE_HEIGHT);
						paddle.setFilled(true);
						add(paddle);
					}
				}
			}
			ballHitsPaddle();
			Losing();
			Wining();
		}
	}

	private void Wining() {
		if (point == NBRICKS_PER_ROW * NBRICK_ROWS) {
			removeAll();
			GLabel Win = new GLabel("YOU WON!");
			double XW1 = getWidth() / 2 - Win.getWidth() / 2;
			double XW2 = getHeight() / 2 - Win.getAscent() / 2;
			add(Win, XW1, XW2);
		}
	}

	private void Bricks(int i, int j) {
		// Bricks X coordinates
		int Xcord = (int) (i * (BRICK_WIDTH + BRICK_SEP));
		// Bricks Y coordinates
		int Ycord = (int) (j * (BRICK_HEIGHT + BRICK_SEP));
		// Create Bricks
		GRect Bricks = new GRect(Xcord + BRICK_SEP / 2, Ycord + BRICK_Y_OFFSET, BRICK_WIDTH, BRICK_HEIGHT);
		Bricks.setFilled(true);
		// Let set color red at the 2 row
		if (j < 2) {
			Bricks.setColor(Color.RED);
		}
		// Others 2 row with Orange
		if (j > 1 && j <= 3) {
			Bricks.setColor(Color.ORANGE);
		}
		// Others 2 with yellow
		if (j > 3 && j <= 5) {
			Bricks.setColor(Color.YELLOW);
		}
		// Others with green
		if (j > 5 && j <= 7) {
			Bricks.setColor(Color.GREEN);
		}
		// And others with cyan
		if (j > 7 && j < 10) {
			Bricks.setColor(Color.CYAN);
		}
		add(Bricks);
	}
}