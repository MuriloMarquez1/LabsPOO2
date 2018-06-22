package lab1;
import lab1.Attacks.MediumAttack;
import lab1.Attacks.StrongAttack;
import lab1.Jumps.HighJump;
import lab1.Jumps.LowJump;
import lab1.Jumps.MediumJump;
import lab1.Runs.FastRun;
import lab1.Runs.MediumRun;

public class Lab1 {
	public static void Exercice() {
		Character character1 = new Character();
		Character character2 = new Character();
		Character character3 = new Character();
		
		character1.setSkills(new StrongAttack(), new MediumJump(), new MediumRun());
		character2.setSkills(new MediumAttack(), new HighJump(), new FastRun());
		character3.setSkills(new StrongAttack(), new LowJump(), new FastRun());
		
		System.out.println("Personagem 1");
		character1.attack();
		character1.run();
		character1.jump();		
		System.out.println("Personagem 2");
		character2.attack();
		character2.run();
		character2.jump();
		System.out.println("Personagem 3");
		character3.attack();
		character3.run();
		character3.jump();
	}
}
