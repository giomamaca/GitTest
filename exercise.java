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

	private GObject getCollidingObject(int a, int b){
		return getElementAt(a, b);
	}
	
	public void run() {
		block = new GRect(getWidth() - 100, getHeight() / 2 - 100, 100,200);
		block.setFilled(true);
		add(block);
		
		ball = new GOval(0, getHeight() / 2 - 10, 20, 20);
		add(ball);
		while(true){
			ball.move(x, 0);
			pause(5);
			GObject collider = getCollidingObject(getWidth() - 100, getHeight() / 2 - 100);
			if(ball.getX() > getWidth() - 100 - 20){
				if(collider != null){
					remove(collider);
					x *= -1;
				}
			}
		}
	}
}
