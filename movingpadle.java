import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class movingpadle extends GraphicsProgram{
	
	private GRect r;
	
	public void run(){
		addMouseListeners();
	}
	public void mouseMoved(MouseEvent e){
		add(r(100, 5), e.getX() , getHeight() - 50);
	}
}
