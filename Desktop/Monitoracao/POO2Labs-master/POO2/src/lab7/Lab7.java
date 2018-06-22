package lab7;

import lab5.CharacterFactory;
import lab5.MedievalCharacterFactory;

public class Lab7 {
	public static void Exercice() {
		JoyStickFactory factory1 = new JoyStickFactory();
		CharacterFactory factory2 = new MedievalCharacterFactory();
		JoyStick controller = factory1.Create(factory2.Create());
		controller.pressedA();
		controller.pressedB();
		controller.pressedC();
		controller.pressedDown();
		controller.pressedLeft();
		controller.pressedUp();
		controller.pressedRight();
	}
}
