//კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

import stanford.karel.SuperKarel;

public class Practice06 extends SuperKarel {
	public void run() {
		move();
		while(beepersPresent()){
			aige1();
		}
		move();
		while(beepersPresent()){
			aige2();
		}
	}

	private void aige2() {
		pickBeeper();
		move();
		putBeeper();
		turnAround();
		move();
		turnAround();
	}

	private void aige1() {
		pickBeeper();
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
	}
}