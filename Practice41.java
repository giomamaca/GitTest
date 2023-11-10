import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Practice41 extends GraphicsProgram{
	public void run(){
		addMouseListeners();
	}

	public void mouseMoved(MouseEvent w){
		add(new GOval(5 , 5), w.getX(), w.getY());
	}
}
