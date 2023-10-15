import stanford.karel.SuperKarel;

public class assignment1P4 extends SuperKarel {
	public void run(){
		turnLeft();
// 		Karel fills diagonal
		while(frontIsClear()){
			fillDiagonal();
			}
		turnAround();
//		Karel goes down
		while(frontIsClear()){
			move();
		}
		turnAround();
// 		Karel fills second diagonal
		while(frontIsClear()){
			walkOnSecondDiagonal();
		}
		turnRight();
//		Karel is on center
		while(frontIsClear()){
			move();
		}
		turnRight();
//		Karel clears diagonal from beepers
		while(frontIsClear()){
			pickBeeperOnDiagonal();
		}
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnRight();
		while(noBeepersPresent()){
			move();
		}
		turnAround();
//		Karel is on center
    }

	private void pickBeeperOnDiagonal() {
//		Karel put Beepers and walks on diagonal
		if(beepersPresent()){
			pickBeeper();
		}
		move();
		if(beepersPresent()){
			pickBeeper();
		}
		turnRight();
		move();
		turnLeft();
	}

	private void walkOnSecondDiagonal() {
		move();
		turnLeft();
		move();
		turnRight();
//		Now Karel finds center
		if(beepersPresent()){
			turnAround();
//			Karelmoves to center
			while(frontIsClear()){
				move();
			}
//			Karel puts beeper on center
			putBeeper();
		}	
	}

	private void fillDiagonal() {
//		Karel puts beepers on diagonal
		if(noBeepersPresent()){
			putBeeper();
		}
		move();
		if(noBeepersPresent()){
			putBeeper();
		}
		turnRight();
		move();
		turnLeft();
	}
}
