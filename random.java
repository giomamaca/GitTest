import stanford.karel.SuperKarel;

public class random extends SuperKarel {
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
		turnAround();
		move();
		if(noBeepersPresent()){
			putBeeper();
			if(leftIsClear()){
				moveToTheNextLine1();
				move();
		   }
			fillLine();
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