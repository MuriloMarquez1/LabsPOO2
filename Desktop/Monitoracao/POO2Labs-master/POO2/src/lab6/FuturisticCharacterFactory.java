package lab6;

import java.util.Random;

import lab5.Character;
import lab5.CharacterFactory;
import lab5.Factory;
import lab6.Factorys.*;

public class FuturisticCharacterFactory  extends CharacterFactory{

	@Override
	public Character Create() {
		CharacterFactory factory;
		Random generator = new Random();
		float n = generator.nextFloat();
		if (n < .5) {
			factory = new AndroidFactory();
			return factory.Create();
		}	
		factory = new HackerFactory();
		return factory.Create();
	}

}
