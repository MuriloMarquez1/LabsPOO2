package lab4;

import java.util.ArrayList;

public abstract class ShieldSkill {
	protected ArrayList<SkillType> triggers = new ArrayList<SkillType>();
	
	public boolean bloqued(Power power) {
		if (power == null) 
			return false;
		SkillType skillTriggered = this.trigger(power);
		if (skillTriggered != null ) {
			System.out.println("Possui bloqueio a ataques de " + skillTriggered.getClass().getSimpleName());
		    return true;
		}
		return false;
	}
	
	protected SkillType trigger (Power power) {
		for (SkillType skill : triggers) {
			if (skill.getClass().equals(power.getSkillType().getClass())) {
				return skill;
			}
		}
		return null;
	}
}
