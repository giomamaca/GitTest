import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class exercise extends GraphicsProgram{		
//  Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

//  Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

//  Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
		public void run(){
			for(int i = 0; i <= BRICKS_IN_BASE; i++){
				for(int j = 0; j < i; j++){
					addPiramid(i,j);
				}
			}
		}
		private void addPiramid(int i, int j) {
			addPiramid(i, j );
		}
}
