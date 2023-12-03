import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MidTerm1625 extends GraphicsProgram{
	
	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 25;
	private final static int DELAY = 2000;
	
	private GOval oval;
	
	private GOval o1 = null;
	private GOval o2 = null;
	
	private Color c1;
	private Color c2;
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		addMouseListeners();
		drawOvals();
	}

	private void drawOvals() {
		for(int i = 0; i < CIRCLE_NUM; i++){
			double corX = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double corY = rgen.nextDouble(0, getHeight() - CIRCLE_D);
			
			oval = new GOval(corX, corY, CIRCLE_D,CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(Color.RED));
			add(oval);
		}
		while(true){
			double corX = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double corY = rgen.nextDouble(0, getHeight() - CIRCLE_D);
			oval = new GOval(corX, corY, CIRCLE_D,CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
			
			pause(DELAY);
		}
	}
	
	public void mouseClicked(MouseEvent e){
		GObject o = getElementAt(e.getX(), e.getY());
		
		if(o1 == null){
			o1 = (GOval) o;
			c1 = o1.getColor();
		}else{
			if(o2 == null){
				o2 = (GOval) o;
				c2 = o2.getColor();
			}
		}
		if(c1 == c2){
			remove(o1);
			remove(o2);
			o1 = null;
			o2 = null;
		}else{
			o1 = null;
			o2 = null;
		}
	}
}
