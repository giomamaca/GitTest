import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2P1 extends GraphicsProgram{
	private static final double BLOCKS = 14;
	private static final double WIDTH = 30;
	private static final double HEIGHT = 15;
	private static final double DOWN = 15;
	private static final double RIGHT = 30;
	public void run(){
		for(int i = 0; i <= BLOCKS; i++){
			for(int j = 0; j < i; j++){
				GRect stairs = new GRect (j*RIGHT + getWidth() / 2 - WIDTH / 2 - i*(WIDTH / 2), i*DOWN + getHeight() - BLOCKS*HEIGHT, WIDTH, HEIGHT);
				add(stairs);
			}
		}
	}
}
