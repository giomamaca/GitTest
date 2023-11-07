import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {
	
	private int x = 1;
	
	public void run() {
		GOval Ball = new GOval (0, getHeight() / 2, 18, 18);
		Ball.setFilled(true);
		add(Ball);
		
		while(true){
			Ball.move(x, 0);
			Ball.pause(5);
			if(Ball.getX()== 0){
				x *= 1;
			}
			if(Ball.getX() == getWidth() - 18){
					x *= -1;					
			}
		}
	}
}
