package lab3;

import lab3.Powers.*;

public class Lab3 {
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
		
		mage.LearnPower(iceLance);
		priest.LearnPower(holyHeal);
		rogue.LearnPower(dash);
		
		System.out.println("Poderes do mago");
		mage.PowersDescriptions();
		System.out.println("Poderes do padre");
		priest.PowersDescriptions();
		System.out.println("Poderes do ladino");
		rogue.PowersDescriptions();
		System.out.println("Poderes do cacador");
		hunter.PowersDescriptions();
	}
}
