import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice22 extends GraphicsProgram{
	private static final double BOARD_WIDTH = 50;
	private static final double BOARD_HEIGHT = 50;
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
		int chessX = (int) (i * BOARD_WIDTH);
		int chessY = (int) (j * BOARD_HEIGHT);
		
		GRect chess = new GRect (chessX, chessY, BOARD_WIDTH, BOARD_HEIGHT);
		if((i + j) % 2 == 0){
			chess.setFilled(true);
			chess.setFillColor(Color.RED);
		}
		add(chess);
	}
}
