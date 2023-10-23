import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P1 extends GraphicsProgram {
	private static final double BRICK_WIDTH = 30;
	private static final double BRICK_HEIGHT = 12;
	private static final double BRICK_IN_BASE = 14;
	private static final double BRICK_IN_ROW = 14;
	public void run(){
		for(int i = 0; i < BRICK_IN_BASE; i++){
			for(int j = 0; j < BRICK_IN_ROW; j--){
				addFirstLine(i, j);
			}
		}
	}
	private void addFirstLine(int i, int j) {
		double rectx = i * BRICK_WIDTH + (getWidth() - BRICK_HEIGHT) / 4 ;
		double recty = j * BRICK_HEIGHT ;
		
		GRect rect = new GRect(rectx, recty, BRICK_WIDTH, BRICK_HEIGHT);
		add(rect);
	}
}
