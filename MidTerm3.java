import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class MidTerm3 extends GraphicsProgram{
	
	private GLine line;
	private int startX = 0;
	private int startY = 0;
	
	public void run(){
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		line = new GLine(startX, startY, e.getX(), e.getY());
		add(line);
		line.setEndPoint(e.getX(), e.getY());
		startX = e.getX();
		startY = e.getY();
	}
	public void mouseRelease(MouseEvent e){
		startX = e.getX();
		startY = e.getY();
	}
	
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
		startX = e.getX();
		startY = e.getY();
	}
}
