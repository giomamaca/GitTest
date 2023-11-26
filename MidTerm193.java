import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class MidTerm193 extends GraphicsProgram{
	
	private static final double RADIUS = 25;
	
	private GOval oval;
	
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		oval = new GOval(e.getX() + RADIUS, e.getY() + RADIUS, 2*RADIUS, 2*RADIUS);
		add(oval);
	}
	
}
