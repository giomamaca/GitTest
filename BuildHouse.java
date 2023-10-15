import acm.graphics.*;
import acm.program.*;

public class BuildHouse extends GraphicsProgram {
	
	private static final int BASE_Y_COORDINATE = 400;
	
	private static final int BASE_X_COORDINATE = 300;
	
	private static final int WALL_HEIGHT = 200;
	
	private static final int WALL_WIDTH = 200;
	
	private static final int ROOF_HEIGHT = 100;
	
	private static final int DOOR_WIDTH = 40;
	
	private static final int DOOR_HEIGHT = 100;
	
	private static final int DOOR_LEFT_OFFSET = 100;
	
	private static final int WINDOW_WIDTH = 40;
	
	private static final int WINDOW_HEIGHT = 40;
	
	private static final int WINDOW_LEFT_OFFSET = 30;
	
	private static final int WINDOW_BASE_OFFSET = 130;
	
	public void run() {
		drawHouse();
	}

	private void drawHouse() {
		drawWalls();
		drawRoof();
		drawDoor();
		drawWindow();
	}

	private void drawDoor() {
		GRect door = new GRect(BASE_X_COORDINATE + DOOR_LEFT_OFFSET,
									BASE_Y_COORDINATE - DOOR_HEIGHT,
									DOOR_WIDTH,
									DOOR_HEIGHT);
		add(door);
	}

	private void drawWindow() {
		GRect window = new GRect(BASE_X_COORDINATE + WINDOW_LEFT_OFFSET,
								BASE_Y_COORDINATE - WINDOW_HEIGHT - WINDOW_BASE_OFFSET,
								WINDOW_WIDTH,
								WINDOW_HEIGHT);
		add(window);
	}

	private void drawRoof() {
		int topLeftCornerX = BASE_X_COORDINATE;
		int topLeftCornerY = BASE_Y_COORDINATE - WALL_HEIGHT;
		
		int topRightCornerX = BASE_X_COORDINATE + WALL_WIDTH;
		int topRightCornerY = BASE_Y_COORDINATE - WALL_HEIGHT;
		
		int middleX = (topLeftCornerX + topRightCornerX) / 2;
		int middleY = topLeftCornerY - ROOF_HEIGHT;
		
		GLine leftSlope = new GLine(topLeftCornerX, topLeftCornerY, middleX, middleY);
		GLine rightSlope = new GLine(middleX, middleY, topRightCornerX, topRightCornerY);
		
		add(leftSlope);
		add(rightSlope);
	}

	private void drawWalls() {
		GRect walls = new GRect(BASE_X_COORDINATE,
								BASE_Y_COORDINATE - WALL_HEIGHT,
								WALL_WIDTH,
								WALL_HEIGHT);
		add(walls);
	}
}