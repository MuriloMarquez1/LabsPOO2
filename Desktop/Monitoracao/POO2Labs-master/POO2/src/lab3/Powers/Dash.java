package lab3.Powers;

import lab3.Power;

public class Dash extends Power {

	public Dash(Power power) {
		super(power);
	}

	@Override
	public void Description() {
		System.out.println("Dash e um ataque rapido e letal");
	}
	
}
