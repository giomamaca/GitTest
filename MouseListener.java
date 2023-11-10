import acm.program.GraphicsProgram;

import com.sun.glass.events.MouseEvent;

import acm.program.*;

public class MouseListener extends GraphicsProgram{
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("hi");
	}
}
