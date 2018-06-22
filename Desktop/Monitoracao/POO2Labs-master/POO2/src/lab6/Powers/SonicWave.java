package lab6.Powers;

import lab4.Power;
import lab4.SkillTypes.Physic;

public class SonicWave extends Power {
	public SonicWave(Power power) {
		super(power);
		this.setSkillType(new Physic());
	}

	@Override
	public void Description() {
		System.out.println("Onda sonica e um ataque rapido artodoante");
	}
}
