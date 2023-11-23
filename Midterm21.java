import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Midterm21 extends GraphicsProgram{
	
	private static final double BOX_SIZE = 200; 
	private GRect rect;
	
	private double recX = getWidth() / 2 - BOX_SIZE / 2;
	private double recY =  getHeight() / 2 - BOX_SIZE / 2;
	
	public void run(){
		
		rect = new GRect (recX, recY, BOX_SIZE, BOX_SIZE); 
		add(rect);
		
		GLabel num = new GLabel("k");
		double X = num.getWidth();
		double Y = num.getAscent();
		add(num, recX + BOX_SIZE / 2 - X / 2, recY + BOX_SIZE / 2 + Y / 2);
		
		addMouseListeners();
	}
	
//	public void mouseDragged(MouseEvent e){	
//		if(getElementAt(e.getX(), e.getY()) == rect){	
//			rect.setLocation(e.getX() - 100, e.getY() - 100);
//		}
	}
}
