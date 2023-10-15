//კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

import stanford.karel.SuperKarel;

public class Practice09 extends SuperKarel {
	public void run() {
		move();
		while (beepersPresent()) {
			pickBeeper();
			move();
			transport();
		}
	}

	private void transport() {
		duplicate();
		move();
		move();
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
		move();
		move();
		move();
		turnAround();
	}

	private void duplicate() {
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
}