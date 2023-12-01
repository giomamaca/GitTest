import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class MidTerm171 extends GraphicsProgram{
	
	private static final double SIZE = 100;
	
	private double X = getWidth() / 2 - SIZE / 2;
	private GRect rect;
	private GLabel num;
	private int k = 0;
	private double cen1 = getWidth() / 2 - SIZE / 2;
	private double cen2	= getHeight() / 2 - SIZE / 2;
	
	public void run(){
		addMouseListeners();
		
		rect = new GRect(0, 0, SIZE, SIZE);
//		num = new GLabel(k);
//		add(num, cen1 - num.getWidth() / 2, cen2 + num.getAscent() / 2);
		add(rect);
		
	}
	
	public void mouseDragged(MouseEvent e){
		double x = e.getX();
		double y = e.getY();
		
		while(getElementAt(x, y) == rect){
			double moveX = e.getX() + SIZE / 2;
			rect.setLocation(moveX, e.getY() + SIZE / 2);
			pause(10);
//			if( k != 9){				
//				if((rect.getX() + SIZE / 2) > X){
//					k++;
//					X = rect.getX() + SIZE / 2;
//				}
//				if((rect.getX() + SIZE / 2) < X){
//					k--;
//					X = rect.getX() + SIZE / 2;
//				}
//			}
		}
	}
}
