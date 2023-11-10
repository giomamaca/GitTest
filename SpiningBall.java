import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SpiningBall extends GraphicsProgram {
	
	public void run(){
		GOval ball = new GOval (100, 100);
		ball.setFilled(true);
		add(ball);
		while(true){
			ball.move(1, 0);			
		}
	}
}
