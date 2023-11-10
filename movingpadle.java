import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class movingpadle extends GraphicsProgram{
	public void run(){
		addMouseListeners();
	}
	private void MouseMoved(MouseEvent e){
		GRect r = new GRect (100, 10, getWidth() / 2 - 50, getHeight() - 50);
		r.setFilled(true);
		add(r);
	}
}
