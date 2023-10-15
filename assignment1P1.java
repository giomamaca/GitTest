import stanford.karel.SuperKarel;

public class assignment1P1 extends SuperKarel{
	public void run(){
//		Karel is facing the wall
		while(frontIsClear()){
			move();
		}
//		now Karel is ready to take the newspaper
		if(frontIsBlocked()){
			moveToexit();
		}
//      Karel is on beeper
		while(noBeepersPresent()){
			move();
		}
//		Karel takes beeper and turns back
		if(beepersPresent()){
			takeAndBack();
		}
	}

	private void takeAndBack() {
//		Karel takes beeper
		pickBeeper();
//		Karel turns around to go back in square
		turnAround();
//		Karel moves forward
		move();
		turnRight();
		while(frontIsClear()){
			move();
		}
//		Now Karel is in thr corner 
		if(frontIsBlocked()){
				turnLeft();
			}
//		Karel goes where it start walking
		while(frontIsClear()){
			move();
		}
		turnAround();
	}

	private void moveToexit() {
		turnRight();
		move();
		turnLeft();
	}

}