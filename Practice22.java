import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice22 extends GraphicsProgram{
	private static final double BOARD_WIDTH = 30;
	private static final double BOARD_HEIGHT = 30;
	private static final double BLOCKS_IN_ROW = 8;
	private static final double BLOCKS_IN_COLUMN = 8;
	public void run(){
		for(int i = 0; i < BLOCKS_IN_ROW; i++){
			for(int j = 0; j < BLOCKS_IN_COLUMN; j++){
				chessBoard(i, j);
			}
		}
	}
	private void chessBoard(int  i, int j) {
		int chessX = (int) (i * BLOCKS_IN_ROW);
		int chessY = (int) (j * BLOCKS_IN_COLUMN);
		
		GRect chess = new GRect (chessX, chessY, BOARD_WIDTH, BOARD_HEIGHT);
		add(chess);
	}
}
