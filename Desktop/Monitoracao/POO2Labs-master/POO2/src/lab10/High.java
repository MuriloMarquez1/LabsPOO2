package lab10;

import lab1.Attacks.StrongAttack;
import lab1.Jumps.HighJump;
import lab1.Runs.FastRun;
import lab5.Character;

public class High extends Energy {
	
	public High(Character character) {
		super(character);
		character.setSkills(new StrongAttack(), new HighJump(), new FastRun());
	}

	@Override
	public void setAtributes(Character character) {
//		character.
	}
}
