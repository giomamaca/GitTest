import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class movingpadle extends GraphicsProgram{	
	public void run(){
//		GRect r = new GRect (getWidth() / 2 - 50, getHeight() - 50, 100, 10);
//		r.setFilled(true);
//		add(r);
		addMouseListeners();
	}
	public void MouseMoved(MouseEvent e){
		add(new GRect(100, 10), getWidth() - 100, getY());
	}
}
