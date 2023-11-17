import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice43 extends GraphicsProgram{
	private static final double RADIUS = 10;
	private GOval circle;
	
	private double x = 100;
	private double y = 100;
	
	
	public void run(){
		circle = new GOval (2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
		
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == circle){
			circle.setLocation(e.getX() - x, e.getY() - y);
		}
	}
	public void mousePressed(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == circle){
			x = e.getX() - circle.getX();
			y = e.getY() - circle.getY();
		}
	}
}
