import acm.program.GraphicsProgram;

import com.sun.glass.events.MouseEvent;

import acm.graphics.GOval;
import acm.program.*;

public class MouseListener extends GraphicsProgram{
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		GOval oval = new GOval(100, 100);
		oval.setFilled(true);
		add(oval);
	}
}