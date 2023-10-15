import acm.graphics.*;
import acm.program.GraphicsProgram;

public class exercise extends GraphicsProgram{	
	public void run(){
		drawLine();
	}

	private void drawLine() {
		double x1 = 100;
		double y1 = 100;
		double x2 = 200;
		double y2 = 100;
		
		GLine line = new GLine (x1, y1, x2, y2);
		add(line);
	}
}