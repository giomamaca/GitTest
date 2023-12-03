import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MidTerm1625 extends GraphicsProgram {

	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 25;
	private final static int DELAY = 2000;

	private GOval oval;

	private GOval o1 = null;
	private GOval o2 = null;

	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		addMouseListeners();
		drawOvals();
	}

	private void drawOvals() {
		for (int i = 0; i < CIRCLE_NUM; i++) {
			double corX = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double corY = rgen.nextDouble(0, getHeight() - CIRCLE_D);
			double corX1 = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double corY1 = rgen.nextDouble(0, getHeight() - CIRCLE_D);

			Color col = rgen.nextColor();

			oval = new GOval(corX, corY, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(col);
			add(oval);

			oval = new GOval(corX1, corY1, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(col);
			add(oval);
		}
		while (true) {
			double corX = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double corY = rgen.nextDouble(0, getHeight() - CIRCLE_D);
			double corX1 = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double corY1 = rgen.nextDouble(0, getHeight() - CIRCLE_D);

			Color col = rgen.nextColor();

			oval = new GOval(corX, corY, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(col);
			add(oval);

			oval = new GOval(corX1, corY1, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(col);
			add(oval);

			pause(DELAY);
		}
	}

	public void mouseClicked(MouseEvent e) {
		GObject o = getElementAt(e.getX(), e.getY());

		if (o == null)
			return;

		o2 = o1;
		o1 = (GOval) o;
		
		if(o2 != null){
			if(o1.getColor() == o2.getColor()){
				remove(o1);
				remove(o2);
				o1 = null;
				o2 = null;
			}
		}
	}
}
