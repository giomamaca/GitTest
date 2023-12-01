import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MidTerm1615 extends GraphicsProgram{
	
	private static final double CIRCLE_D = 40; 
	private GOval cir ;
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		addMouseListeners();
		cir = new GOval (getWidth() / 2 - CIRCLE_D /2, getHeight() / 2 - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
		add(cir);
	}
	
	public void moueClicked(MouseEvent e){
		double x = e.getX();
		double y = e.getY();
		
		if(getElementAt(x, y) == cir){
			cir.setFillColor(rgen.nextColor());
		}
	}
	
	public void mouseDragged(MouseEvent e){
		double x = e.getX();
		double y = e.getY();
		
		GObject center = getElementAt(getWidth() / 2, getHeight() / 2);
		
		
	}
}
