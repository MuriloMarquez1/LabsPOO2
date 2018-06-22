package lab3.Powers;

import lab3.Power;

public class FireBall extends Power {

	public FireBall(Power power) {
		super(power);
	}

	@Override
	public void Description() {
		System.out.println("FireBall e a conjuracao uma esfera de fogo capaz de queimar seus inimigos");
	}

}
