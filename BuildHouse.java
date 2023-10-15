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
		drawRoof();
//		drawDoor();
//		drawWindows();
	}

	private void drawRoof() {
		double x1 = (int) (getHeight() / 2 - HOUSE_HEIGHT  / 2);
		double y1 = getWidth() - HOUSE_WIDTH;
	}

	private void drawWall() {
		GRect wall = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		double y = getHeight() - HOUSE_HEIGHT;
		add(wall, x, y);
	}
}
