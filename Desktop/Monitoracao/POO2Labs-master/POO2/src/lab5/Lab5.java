package lab5;

import lab5.Character;

public class Lab5 {
	public static void Exercice() {
		CharacterFactory factory = new MedievalCharacterFactory();
		Character character1 = factory.Create();
		Character character2 = factory.Create();
		Character character3 = factory.Create();
		Character character4 = factory.Create();
		Character character5 = factory.Create();
	}
}
