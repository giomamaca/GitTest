import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class movingpadle extends GraphicsProgram {

	private GRect r;

	public void run() {
		addMouseListeners();
		r = new GRect(100, 5);
		r.setFilled(true);
	}

	public void mouseMoved(MouseEvent e) {
		if(r.getX() != getWidth() - 50){
			r.setLocation(e.getX() - 50, getHeight() - 50);
			add(r);	
		}
	}
}
