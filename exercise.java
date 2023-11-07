import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {	
	public void run() {
		GOval Ball = new GOval (0, getHeight() / 2, 18, 18);
		Ball.setFilled(true);
		add(Ball);
		
		while(true){
			if(Ball.getX()== 0){
				Ball.move(100, 0);
				pause(5);
			}
			if(Ball.getX() == getWidth()){
				Ball.move(-1,  0);
				pause(5);
			}
		}
	}
}
