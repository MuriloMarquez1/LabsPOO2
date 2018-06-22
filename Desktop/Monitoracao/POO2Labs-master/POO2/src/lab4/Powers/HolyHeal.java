package lab4.Powers;

import lab4.Power;
import lab4.SkillTypes.Holy;

public class HolyHeal extends Power {
	public HolyHeal(Power power) {
		super(power);
		this.setSkillType(new Holy());
	}

	@Override
	public void Description() {
		System.out.println("Holy Heal, cura aliados proximos com o poder da luz!");
	}
}
