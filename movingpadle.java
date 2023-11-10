import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class movingpadle extends GraphicsProgram{
	
	private GRect r;
	
	public void run(){
		GRect r = new GRect (100, 10, getWidth() / 2 - 50, getHeight() - 50);
		r.setFilled(true);
		addMouseListeners();
	}
	public void mouseMoved(MouseEvent e){
		setLocation(e.getX() , getHeight() - 50);
	}
}
