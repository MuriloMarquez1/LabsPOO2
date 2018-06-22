package lab10;

import lab1.Attacks.MediumAttack;
import lab1.Jumps.MediumJump;
import lab1.Runs.MediumRun;
import lab5.Character;

public class Medium extends Energy {

	public Medium(Character character) {
		super(character);
		character.setSkills(new MediumAttack(), new MediumJump(), new MediumRun());
	}

	@Override
	public void setAtributes(Character character) {
	}

}
