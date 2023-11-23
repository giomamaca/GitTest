import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice43 extends GraphicsProgram{
	private static final double RADIUS = 100;
	private GOval ball;
	
	private double x = 100;
	private double y = 100;
	
	
	public void run(){
		ball = new GOval (2 * RADIUS, 2 * RADIUS);
		ball.setFilled(true);
		add(ball);
		
		addMouseListeners();
	}
	public void mouseDragged (MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == ball){
			ball.setLocation(e.getX() - x, e.getY() - y);
		}
	}
}
