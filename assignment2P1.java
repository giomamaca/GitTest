import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P1 extends GraphicsProgram {
	private static final double BRICK_WIDTH = 30;
	private static final double BRICK_HEIGHT = 12;
	private static final double BRICK_IN_BASE = 14;
	public void run(){
		for(int i = 0; i < BRICK_IN_BASE; i++){
			GRect Brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
			add(Brick);
		}
	}
}
