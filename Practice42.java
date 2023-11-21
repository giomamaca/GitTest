import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice42 extends GraphicsProgram{
	
	private GLine line;
	private int startX = 0;
	private int startY = 0;
	private int lastX 
	
	public void run(){
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		line = new GLine (e.getX(), e.getY(), e.getX(),e.getY());
		add(line);
		
	}
	
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
}
