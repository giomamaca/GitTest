import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class stairs extends GraphicsProgram{
	private static final double WIDTH = 30;
	private static final double HEIGHT = 15;
	private static final double DOWN = 15;
	private static final double RIGHT = 30;
	public void run(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				addStairs(i, j);
			}
		}
	}
	private void addStairs(int i, int j) {
		int stairsx = (int) ((int) i * WIDTH) + i*30;
		int stairsy = (int) ((int) j *HEIGHT) + j*15;
		
		GRect stairs = new GRect (stairsx, stairsy, WIDTH, HEIGHT);
	    add(stairs);
	}
}
