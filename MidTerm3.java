import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class MidTerm3 extends GraphicsProgram{
	
	private GLine line;
	
	public void run(){
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		line = new GLine(0,0, e.getX(), e.getY());
		add(line);
		line.setEndPoint(e.getX(), e.getY());
	}
}
