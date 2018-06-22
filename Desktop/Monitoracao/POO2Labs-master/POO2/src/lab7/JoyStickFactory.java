package lab7;

import lab5.Character;

public class JoyStickFactory {
	
	public JoyStick Create(Character character) {
		return new JoyStick(character);
	}
}
