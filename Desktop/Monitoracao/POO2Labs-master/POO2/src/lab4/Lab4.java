package lab4;

import lab1.Attacks.*;
import lab1.Jumps.*;
import lab1.Runs.*;
import lab4.Character;
import lab4.Power;
import lab4.Powers.*;
import lab4.Shields.*;
import lab4.Enemy;

public class Lab4 {
	public static void Exercice() {
		Power mortalStrike = new MortalStrike(null);
		Power fireBall = new FireBall(null);
		Power holyHeal = new HolyHeal(null);
		Power dash = new Dash(mortalStrike);
		Power iceLance = new IceLance(fireBall);
		
		Character mage = new Character();
		Character rogue = new Character();
		Character priest = new Character();
		Character hunter = new Character();
		
		mage.setSkills(new StrongAttack(), new MediumJump(), new MediumRun());
		rogue.setSkills(new MediumAttack(), new HighJump(), new FastRun());
		hunter.setSkills(new StrongAttack(), new LowJump(), new FastRun());
		priest.setSkills(new WeakAttack(), new LowJump(), new SlowRun());
		
		Enemy enemy1 = new Enemy();
		Enemy enemy2 = new Enemy();
		Enemy enemy3 = new Enemy();
		
		enemy1.setSkills(new MediumAttack(), new HighJump(), new FastRun());
		enemy2.setSkills(new StrongAttack(), new LowJump(), new FastRun());
		enemy3.setSkills(new WeakAttack(), new MediumJump(), new SlowRun());
		
		mage.LearnPower(iceLance);
		priest.LearnPower(holyHeal);
		rogue.LearnPower(dash);
		
		enemy1.LearnPower(iceLance);
		enemy2.LearnPower(iceLance);
		enemy3.LearnPower(dash);
		
		enemy1.Observer(mage);
		enemy2.Observer(priest);
		enemy3.Observer(rogue);
		
		mage.addProtection(new FireShield());
		mage.addProtection(new IceShield());
		rogue.addProtection(new FireShield());
		priest.addProtection(new IceShield());
		
		System.out.println("Poderes do mago");
		mage.PowersDescriptions();
		System.out.println("Poderes do padre");
		priest.PowersDescriptions();
		System.out.println("Poderes do ladino");
		rogue.PowersDescriptions();
		System.out.println("Poderes do cacador");
		hunter.PowersDescriptions();
		
		System.out.println("Mago se movimentando");
		
		mage.run();
		mage.run();
		mage.run();
		mage.run();
		mage.run();
		mage.run();
		mage.run();
		
		System.out.println("Padre se movimentando");
		
		priest.run();
		priest.run();
		priest.run();
		priest.run();
		priest.run();
		
		System.out.println("Ladino se movimentando");
		
		rogue.run();
		rogue.run();
		rogue.run();
		rogue.run();
		rogue.run();
		rogue.run();
		rogue.run();
		
		System.out.println("Cacador se movimentando");
		
		hunter.run();
		hunter.run();
		hunter.run();
	}
}
