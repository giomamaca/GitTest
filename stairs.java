import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class stairs extends GraphicsProgram{
	private static final double WIDTH = 30;
	private static final double HEIGHT = 15;
	private static final double DOWN = 15;
	private static final double RIGHT = 30;
	public void run(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < i*DOWN; j++){
				GRect stairs = new GRect (i, j, WIDTH, HEIGHT);
				add(stairs);
			}
		}
	}
}
