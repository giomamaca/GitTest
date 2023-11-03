import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2P1 extends GraphicsProgram {
	// Amount of blocks
	private static final double BLOCKS = 14;
	// This is width of blocks
	private static final double BLOCK_WIDTH = 30;
	// This is height of blocks
	private static final double BLOCK_HEIGHT = 15;

	public void run() {
		// for discribes how much much blocks should be put on vertikal
		for (int i = 0; i <= BLOCKS; i++) {
			// This for adds one block on every other line
			for (int j = 0; j < i; j++) {
				addPiramid(i, j);
			}
		}
	}

	private void addPiramid(int i, int j) {
		// First on every other line blocks move left to make piramid
		GRect stairs = new GRect(j * BLOCK_WIDTH + getWidth() / 2 - BLOCK_WIDTH / 2 - i * (BLOCK_WIDTH / 2),
				i * BLOCK_HEIGHT + getHeight() - BLOCKS * BLOCK_HEIGHT, BLOCK_WIDTH, BLOCK_HEIGHT);
		add(stairs);
	}
}