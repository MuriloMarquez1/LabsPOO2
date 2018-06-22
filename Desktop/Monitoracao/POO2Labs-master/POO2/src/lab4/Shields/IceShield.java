package lab4.Shields;

import lab4.ShieldSkill;
import lab4.SkillTypes.Ice;

public class IceShield extends ShieldSkill {
	
	public IceShield() {
		this.triggers.add(new Ice());
	}
}
