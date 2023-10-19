import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice21 extends GraphicsProgram {
	private static final int NUM_LINES = 11;
	public void run(){
		for(int i = 0; i < NUM_LINES; i++){
			drawHorisont(i);
		}
	}
	private void drawHorisont(int i) {
		double y = i * (getHeight() / (NUM_LINES ));
		double x1 = 0;
		double x2 = getWidth();
		GLine line = new GLine (x1, y, x2, y);
		add(line);
	}
}