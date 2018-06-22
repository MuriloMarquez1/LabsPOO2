package lab6;

import lab5.Character;
import lab5.CharacterFactory;
import lab5.MedievalCharacterFactory;

public class Lab6 {
	public static void Exercice() {
		System.out.println("Personagens medievais");
		CharacterFactory factory = new MedievalCharacterFactory();
		Character character1 = factory.Create();
		Character character2 = factory.Create();
		Character character3 = factory.Create();
		Character character4 = factory.Create();
		Character character5 = factory.Create();
		System.out.println("Personagens futuristas");
		CharacterFactory factory2 = new FuturisticCharacterFactory();
		Character character6 = factory2.Create();
		Character character7 = factory2.Create();
		Character character8 = factory2.Create();
		Character character9 = factory2.Create();
	}
}
