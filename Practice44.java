import acm.program.GraphicsProgram;

import com.sun.glass.events.MouseEvent;

import acm.graphics.GOval;
import acm.program.*;

public class Practice44 extends GraphicsProgram{
	
	private GOval oval;
	
	public void run(){
		addMouseListeners();
	}

	private void mouseClicked(MouseEvent e) {
		oval.setFilled(true);
		add(oval);
	}
}
