package lab4.Powers;

import lab4.Power;
import lab4.SkillTypes.Physic;

public class Dash extends Power{
	public Dash(Power power) {
		super(power);
		this.setSkillType(new Physic());
	}

	@Override
	public void Description() {
		System.out.println("Dash e um ataque rapido e letal");
	}
}
