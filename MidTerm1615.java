import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class MidTerm1615 extends GraphicsProgram{
	
	private static final double CIRCLE_D = 40; 
	
	public void run(){
		addMouseListeners();
		GOval cir = new GOval (getWidth() / 2 - CIRCLE_D /2, getHeight() / 2 - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
		add(cir);
	}
	public void mouseDragged(MouseEvent e){
		
	}
	
}
