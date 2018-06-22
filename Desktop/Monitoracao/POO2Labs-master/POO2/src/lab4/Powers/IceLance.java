package lab4.Powers;

import lab4.Power;
import lab4.SkillTypes.Ice;

public class IceLance extends Power {
	public IceLance(Power power) {
		super(power);
		this.setSkillType(new Ice());
	}

	@Override
	public void Description() {
		System.out.println("Ice Lance, atira uma lanca de gelo extremamente resistence");
	}
}
