import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class MidTerm3 extends GraphicsProgram{
	
	private GLine line;
	
	public void run(){
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		line = new GLine(e.getX(),e.getY(), e.getX(), e.getY());
		add(line);
	}
	public void mouseDragged(MouseEvent q){
		line.setEndPoint(q.getX(), q.getY());
	}
}
