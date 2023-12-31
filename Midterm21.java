import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Midterm21 extends GraphicsProgram{
	
	private static final double BOX_SIZE = 200; 
	private GRect rect;
	private GLabel num;
	
	public void run(){
		
		
		double recX = getWidth() / 2 - BOX_SIZE / 2;
		double recY =  getHeight() / 2 - BOX_SIZE / 2;
		
		rect = new GRect (recX, recY, BOX_SIZE, BOX_SIZE); 
		add(rect);
		
		num = new GLabel("0");
		double X = num.getWidth();
		double Y = num.getAscent();
		add(num, recX + BOX_SIZE / 2 - X / 2, recY + BOX_SIZE / 2 + Y / 2);
		
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e){	
		if(getElementAt(e.getX(), e.getY()) == rect || getElementAt(e.getX(), e.getY()) == num){	
			rect.setLocation(e.getX() - 100, e.getY() - 100);
			num.setLocation(e.getX() - 100 +  BOX_SIZE / 2 - num.getWidth() / 2, e.getY() - 100 + BOX_SIZE / 2 + num.getAscent() / 2);
		}
	}
}
