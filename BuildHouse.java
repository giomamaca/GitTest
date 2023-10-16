import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class BuildHouse extends GraphicsProgram {
	
	private static final double HOUSE_HEIGHT = 400;
	private static final double HOUSE_WIDTH = 200;
	private static final double ROOF_HEIGHT = 60;
	private Color yellow;
	
	public void run (){
		drawHouse();
	}

	private void drawHouse() {
    	drawWall();
		drawRoof1();
		drawRoof2();
		drawDoor();
//		drawWindow();
	}
	
	

	private void drawDoor() {
		double doorx1 = getWidth() / 2 - 100 + HOUSE_HEIGHT / 3;
		double doory1 = getHeight() / 2 + HOUSE_WIDTH;
		double doorx2 = getWidth() / 2 - 100 + 2*HOUSE_HEIGHT / 3;
		double doory2 = getHeight() / 2 + HOUSE_WIDTH;
		
		GRect door = new GRect (doorx1, doory1, doorx2, doory2);
		add(door);
	}

	private void drawRoof2() {
		double x3 = getWidth() / 2 - 100 + HOUSE_HEIGHT /2;
		double y3 = getHeight() / 2 - 60;
		double x4 = getWidth() / 2 - 100 + HOUSE_HEIGHT;
		double y4 = getHeight() / 2;
		
		 GLine line = new GLine (x3, y3 ,x4, y4);
		 add(line);
	}

	private void drawRoof1() {
		double x1 = getWidth() / 2 - 100;
		double y1 = getHeight() / 2;
		double x2 = getWidth() / 2 - 100 + HOUSE_HEIGHT /2;
		double y2 = y1 - 60;
		
		 GLine line = new GLine (x1, y1 ,x2, y2);
		 add(line);
	}

	private void drawWall() {
		GRect wall = new GRect (HOUSE_HEIGHT, HOUSE_WIDTH);
		double x = getWidth() / 2 - 100;
		double y = getHeight() / 2;
		
		add(wall, x, y);
	}
}