package lab10;

import lab1.Attacks.WeakAttack;
import lab1.Jumps.LowJump;
import lab1.Runs.SlowRun;
import lab5.Character;

public class Low extends Energy{

	public Low(Character character) {
		super(character);
		character.setSkills(new WeakAttack(), new LowJump(), new SlowRun());
	}

	@Override
	public void setAtributes(Character character) {
//		character.
	}

}
