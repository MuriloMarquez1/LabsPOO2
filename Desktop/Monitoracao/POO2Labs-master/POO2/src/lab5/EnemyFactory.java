package lab5;

import java.util.Random;

import lab1.Attacks.MediumAttack;
import lab1.Attacks.StrongAttack;
import lab1.Attacks.WeakAttack;
import lab1.Jumps.HighJump;
import lab1.Jumps.LowJump;
import lab1.Jumps.MediumJump;
import lab1.Runs.FastRun;
import lab1.Runs.SlowRun;
import lab4.Enemy;

public class EnemyFactory extends Factory {
	public Enemy Create() {
		Enemy enemy = new Enemy();
		Random generator = new Random();
		float n = generator.nextFloat();
		if (n < .2) {
			enemy.setSkills(new MediumAttack(), new HighJump(), new FastRun());
		}
		if (n < .4) {
			enemy.setSkills(new StrongAttack(), new LowJump(), new FastRun());
		}
		if (n < .6) {
			enemy.setSkills(new WeakAttack(), new MediumJump(), new SlowRun());
		} else {
			enemy.setSkills(new WeakAttack(), new LowJump(), new FastRun());
		}
		return enemy;
	}
}