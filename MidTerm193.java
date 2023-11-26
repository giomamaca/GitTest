import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.paint.Color;

public class MidTerm193 extends GraphicsProgram{
	
	private static final double RADIUS = 25;
	
	private GOval oval;
	
	RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		oval = new GOval(e.getX() - RADIUS, e.getY() - RADIUS, 2*RADIUS, 2*RADIUS);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval);
	}
}
