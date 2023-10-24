import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2P1 extends GraphicsProgram{
	private static final double BLOCKS = 14;
	private static final double BLOCK_WIDTH = 30;
	private static final double BLOCK_HEIGHT = 15;
	public void run(){
		for(int i = 0; i <= BLOCKS; i++){
			for(int j = 0; j < i; j++){
				GRect stairs = new GRect (j*BLOCK_WIDTH + getWidth() / 2 - WIDTH / 2 - i*(WIDTH / 2), i*BLOCK_HEIGHT + getHeight() - BLOCKS*HEIGHT, WIDTH, HEIGHT);
				add(stairs);
			}
		}
	}
}
