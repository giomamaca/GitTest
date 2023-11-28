import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MidTerm1645 extends GraphicsProgram{
	
	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 50;
	private final static int DELAY = 2000;
	
	private int count = 0;
	private GOval ball;
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		drawCircle();
		while(getElementCount() != 0 && getElementCount() <= 50){
			drawCircle();			
			pause(DELAY);
		}
		addMouseListeners();
	}

	public void mouseClicked (MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) != null){
			count++;
			if(count == 3){
				remove(ball);
				count = 0;
			}
		}
	}

	private void drawCircle() {
		ball = new GOval (rgen.nextInt(0, getWidth() - CIRCLE_D), rgen.nextInt(0, getHeight() - CIRCLE_D), CIRCLE_D / 2, CIRCLE_D / 2);
		ball.setFilled(true);
		add(ball);
	}
}
