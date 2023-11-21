import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice42 extends GraphicsProgram{
	
	private GLine line;
	private int startX = 0;
	private int startY = 0;
	private int lastX = 0;
	private int lastY = 0;
	
	public void run(){
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		line = new GLine (startX, startY, lastX, lastY);
		add(line);
		startX = e.getX();
		startY = e.getY();
	}	
}
