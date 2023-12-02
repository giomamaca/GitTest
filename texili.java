import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class texili extends GraphicsProgram{
	
	private double startX = 0;
	private double startY = 0;
	
	private GLine line;
	
	public void run(){
		addMouseListeners();
	}
	public void mouseDragged(MouseEvent e){
		line = new GLine(startX, startY, e.getX(), e.getY());
		add(line);
		
		line.setEndPoint(e.getX(), e.getY());
		
		startX = e.getX();
		startY = e.getY();
	}
	pu
	
}
