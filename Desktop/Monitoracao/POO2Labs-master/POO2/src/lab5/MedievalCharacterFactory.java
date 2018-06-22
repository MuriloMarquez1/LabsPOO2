package lab5;

import java.util.Random;

import lab5.Character;
import lab5.Factorys.*;

public class MedievalCharacterFactory extends CharacterFactory{
	
	public Character characterCreated;
	
	public Character Create() {
		MedievalCharacterFactory factory;
		Random generator = new Random();
		float n = generator.nextFloat();
		if (n < .2) {
			factory = new WarFactory();
			return factory.Create();
		}	
		if (n < .4) {
			factory = new PriestFactory();
			return factory.Create();
		}
		if (n < .6) {
			factory = new HunterFactory();
			return factory.Create();
		}
		if (n < .8) {
			factory = new RogueFactory();
			return factory.Create();
		}
		factory = new MageFactory();
		
		return factory.Create();
	}
}
