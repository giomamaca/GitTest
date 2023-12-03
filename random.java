import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class random extends GraphicsProgram {

	private static final double MIN_RADIUS = 30;
	private static final double MAX_RADIUS = 80;
	private GOval oval;


	private GOval lastClick = null;
	private GOval moving = null;

	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		addMouseListeners();
		drawBalls();
		movingBall();
	}

	private void movingBall() {
		while(true){
			if(moving != null){
				moving.move(0, 3);
			}
			pause(10);
		}
	}

	private void drawBalls() {
		for (int i = 0; i < 25; i++) {
			double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
			double coordX = rgen.nextDouble(0, getWidth() - radius);
			double coordY = rgen.nextDouble(0, getHeight() - radius);
			oval = new GOval(coordX, coordY, radius, radius);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
		}
	}

	public void mouseClicked(MouseEvent e) {
		GObject o = getElementAt(e.getX(), e.getY());

		if (o != null) {
			lastClick = (GOval) o;
			lastClick.setColor(rgen.nextColor());
			moving = null;
		}else{	
			if (lastClick != null) {
				moving = lastClick;
			}
		}
	}
}
