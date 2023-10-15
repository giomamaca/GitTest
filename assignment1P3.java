import stanford.karel.SuperKarel;

public class assignment1P3 extends SuperKarel {
	public void run(){
		if(frontIsBlocked()){
			turnLeft();
		}
		while(frontIsClear()){
//			Karel fills line 
			fillLine();
			if(frontIsBlocked()){
				turnAround();
				move();
//				Karel checks if line is odd or even
				if(beepersPresent()){
					repositionEvenLine();
				}else{
				    repositionOddLine();
				}
			}
		}
	}


	private void repositionEvenLine() {
		turnAround();
		move();
//		Karel goes up from left side
		if(leftIsClear()){
			moveToTheNextLine1();
       }
	    fillLine();
//	    Karel goes up from right side
	    if(rightIsClear()){
			moveToTheNextLine2();
	   }
	}


	private void repositionOddLine() {
//		When line is even Karel moves end of the line
		turnAround();
		move();
//		Karel puts beeper
		if(noBeepersPresent()){
			putBeeper();
//			Then karel goes up 
			if(leftIsClear()){
				moveToTheNextLine1();
//				Karel makes one more step
				move();
		   }
//			Karel fils line
			fillLine();
//			Karel is on right side and it goes up
			if(leftIsClear()){
			    if(rightIsClear()){
					moveToTheNextLine2();
			   }
			}
		}
	}


	private void moveToTheNextLine2() {
//		while Karel is on right side it goes up
		turnRight();
		if(frontIsClear()){
				move();
		}
			turnRight();
    }

	private void moveToTheNextLine1() {
//		while Karel is on left side it goes up
		turnLeft();
		if(frontIsClear()){
			move();
		}
		turnLeft();
	}

	private void fillLine() {
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
//	      Karel makes two steps		
			if(frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
			}
		}
	}
}
