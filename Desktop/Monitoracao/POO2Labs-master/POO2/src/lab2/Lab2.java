package lab2;

import lab1.Attacks.*;
import lab1.Jumps.*;
import lab1.Runs.*;

public class Lab2 {
	public static void Exercice() {
		Character character1 = new Character();
		Enemy enemy1 = new Enemy();
		Enemy enemy2 = new Enemy();
		Enemy enemy3 = new Enemy();
		
		character1.setSkills(new StrongAttack(), new MediumJump(), new MediumRun());
		enemy1.setSkills(new MediumAttack(), new HighJump(), new FastRun());
		enemy2.setSkills(new StrongAttack(), new LowJump(), new FastRun());
		enemy3.setSkills(new WeakAttack(), new MediumJump(), new SlowRun());
		
		enemy1.Observer(character1);
		enemy2.Observer(character1);
		enemy3.Observer(character1);
		
		System.out.println("Personagem 1");
		character1.run();
		character1.run();	
		character1.run();	
		character1.run();
		character1.run();
		character1.run();	
		character1.run();	
		character1.run();
		character1.run();
		character1.run();	
		character1.run();	
		character1.run();
	}
}
