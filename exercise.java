import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {

	private static final double BLOCK_WIDTH = 60;
	private static final double BLOCK_HEIGHT = 20;
	
	private GOval ball;

	private int x = 1;
	private int y = 1;

	
	public void run() {
		ball = new GOval(0, getHeight() - 10, 20, 20);
		add(ball);
		while(true){
			ball.move(1, 0);
			pause(10);
		}
	}
}
