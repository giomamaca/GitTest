import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Practice21 extends GraphicsProgram {

	private static final int CELL_NUMEBR_IN_ROW = 10;
	private static final int CELL_NUMEBR_IN_COLUMN = 10;

	private static final int CELL_HEIGHT = 30;
	private static final int CELL_WIDTH = 30;

	public void run() {

		for (int i = 0; i < CELL_NUMEBR_IN_COLUMN; i++) {
			for (int j = 0; j < CELL_NUMEBR_IN_ROW; j++) {
				// (i;j) (column; row)
				addCellOnIColumnJRow(i, j);
			}
		}	
	}

	private void addCellOnIColumnJRow(int i, int j) {
		int rectX = i * CELL_WIDTH;
		int rectY = j * CELL_HEIGHT;

		GRect rect = new GRect(rectX, rectY, CELL_WIDTH, CELL_HEIGHT);
		if ((i + j) % 2 == 0) {
			rect.setFilled(true);
			rect.setFillColor(Color.RED);
		}
		add(rect);
	}

}