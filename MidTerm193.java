import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.paint.Color;

public class MidTerm193 extends GraphicsProgram{
	private final int CIRCLE_D = 100;
	private final int DELAY = 100;
	RandomGenerator rgen = new RandomGenerator();
	private GObject obj;

	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		double x = e.getX();
		double y = e.getY();
		
		if(getElementAt(x,y) == null){
			GOval oval = new GOval (x - CIRCLE_D / 2, y - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(randomColor());
			add(oval);
		}		
		if(getElementAt(x,y) != null){
			obj = getElementAt(x,y);
			while(obj.getColor() !=  java.awt.Color.green){
				obj.setColor(randomColor());
			}
		}
	}

	private java.awt.Color randomColor() {
		int a = rgen.nextInt(5);
		if(a == 0){
			return java.awt.Color.green;
		}
		if(a == 1){
			return java.awt.Color.RED;
		}
		if(a == 2){
			return java.awt.Color.BLUE;
		}
		if(a == 3){
			return java.awt.Color.BLACK;
		}
		return java.awt.Color.YELLOW;
	}
}