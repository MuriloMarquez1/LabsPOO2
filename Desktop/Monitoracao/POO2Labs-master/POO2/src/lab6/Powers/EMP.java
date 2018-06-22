package lab6.Powers;

import lab4.Power;
import lab4.SkillTypes.Physic;

public class EMP extends Power{
	public EMP(Power power) {
		super(power);
		this.setSkillType(new Physic());
	}

	@Override
	public void Description() {
		System.out.println("EMP ataque paralisante em area");
	}
}
