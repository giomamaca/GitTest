import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class movingpadle extends GraphicsProgram{
	
	private GRect r;
	
	public void run(){
		addMouseListeners();
	}
	public void MouseMoved(MouseEvent e){
		r = new GRect (100, 10, getWidth() / 2 - 50, getHeight() - 50);
		r.setFilled(true);
		add(r);
	}
}
