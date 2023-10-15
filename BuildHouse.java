import acm.graphics.*;
import acm.program.GraphicsProgram;

public class BuildHouse extends GraphicsProgram  {
	
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 200;
	
	
	public void run(){
		drawHouse();
	}

	private void drawHouse() {
		drawWall();
//		drawRoof();
//		drawDoor();
//		drawWindows();
	}

	private void drawWall() {
		GRect wall = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		add(wall);
	}
}
