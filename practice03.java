import stanford.karel.SuperKarel;

public class practice03 extends SuperKarel {
	public void run(){
		move();
	while(frontIsClear()){
		if(beepersPresent()){
			pickBeeper();
			}
		move();
		while(beepersPresent()){
		}
	   }	
	}
}
