import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
public class MidTerm1635 extends GraphicsProgram{
	private final static int CIRCLE_D = 120;
	private final static int DELAY = 500;
	private final static int N_COLORS = 5;
	private final static int RECHECK_DELAY = 50;

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private GOval currentCircle = null;
	
	public void run(){
		addMouseListeners();
		makeCirclesFlicker();
	}
	
	public void mouseClicked(MouseEvent e) {
		GObject el = getElementAt(e.getX(), e.getY());
		
		if(el == null) {
			drawCircle(e.getX(), e.getY());
		} else {
			if(currentCircle == null) {
				currentCircle = (GOval)el;
			}
		}
		
	}
	
	private void drawCircle(double x, double y) {
		GOval circle = new GOval(CIRCLE_D, CIRCLE_D);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle, x - CIRCLE_D / 2, y - CIRCLE_D / 2);
	}
	private void makeCirclesFlicker() {
		while(true) {
			if(currentCircle != null) {
				while(currentCircle.getColor() != Color.GREEN) {
					currentCircle.setColor(getRandomColor());
					pause(DELAY);
				}
				currentCircle = null;
			}
			
			pause(RECHECK_DELAY);
		}
	}
	private Color getRandomColor() {
		int randomColorNumber = rgen.nextInt(N_COLORS);
		
		if(randomColorNumber == 0) {
			return Color.GREEN;
		} else if(randomColorNumber == 1) {
			return Color.RED;
		} else if(randomColorNumber == 2) {
			return Color.BLUE;
		} else if(randomColorNumber == 3) {
			return Color.BLACK;
		}
		
		return Color.YELLOW;
	}
	
}
