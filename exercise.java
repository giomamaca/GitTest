import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {

	private static final double BLOCK_WIDTH = 60;
	private static final double BLOCK_HEIGHT = 20;
	
	private GOval ball;
	private GRect block;
	
	private int x = 1;
	private int y = 1;

	
	public void run() {
		block = new GRect(getWidth() -200, getHeight() / 2 - 50, 200,100);
		block.setFilled(true);
		add(block);
		
		ball = new GOval(0, getHeight() / 2 - 10, 20, 20);
		add(ball);
		while(true){
			ball.move(1, 0);
			pause(10);
		}
	}
}
