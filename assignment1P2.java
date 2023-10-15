import stanford.karel.SuperKarel;

public class assignment1P2 extends SuperKarel{
	public void run(){
		turnLeft();
		while(frontIsClear()){
//			Karel fills wall with beepers
			if(frontIsClear()){
				fillLine();
		}
			turnLeft();
//			After filling wall Karel moves to 
			if(frontIsClear()){
				moveToTheNextWall();
		}
	}
		if(frontIsBlocked()){
//			if wall contains only 1 block Karel puts beeper and turn right
			if(noBeepersPresent()){
				putBeeper();
			}
			turnRight();
//			Then it goes to fill other walls
			if(frontIsClear()){
				moveToTheNextWall();
		}
			if(frontIsClear()){
				fillLine();
		}
	}
}

	private void moveToTheNextWall() {
//		Karel filled first and now it goes to fill other walls
		move();
		move();
		move();
		move();
		turnLeft();
	}

	private void fillLine() {
		while(frontIsClear()){
//			Where beepers are not presented Karel put them on
			if(noBeepersPresent()){
				putBeeper();
			}
//          let's move up
			move();
		}
//      Now wall is filled and it's time to move down
		turnAround();
		if(noBeepersPresent()){
			putBeeper();
			}
		while(frontIsClear()){
			move();
		}
//		Karel is on 1x1
	}
}