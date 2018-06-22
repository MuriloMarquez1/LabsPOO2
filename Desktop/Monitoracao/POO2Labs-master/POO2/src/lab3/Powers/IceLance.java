package lab3.Powers;

import lab3.Power;

public class IceLance extends Power {

	public IceLance(Power power) {
		super(power);
	}

	@Override
	public void Description() {
		System.out.println("Ice Lance, atira uma lanca de gelo extremamente resistence");
	}

}
