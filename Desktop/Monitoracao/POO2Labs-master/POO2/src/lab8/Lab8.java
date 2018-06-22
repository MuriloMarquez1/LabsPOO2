package lab8;

import lab5.CharacterFactory;
import lab5.EnemyFactory;
import lab5.Character;
import lab5.MedievalCharacterFactory;
import lab7.JoyStick;
import lab7.JoyStickFactory;

public class Lab8 {
	public static void Exercice() {
		MazeFactory factory = new MazeFactory();
		Maze maze = factory.Create();
		JoyStickFactory factory1 = new JoyStickFactory();
		CharacterFactory factory2 = new MedievalCharacterFactory();
		Character player = factory2.Create();
		System.out.println("Spawnando jogador");
		maze.SpawnPlayer(player);
		System.out.println("Spawnando inimigos");
		EnemyFactory enemyFac = new EnemyFactory();
		maze.SpawnEnemy(enemyFac.Create());
		maze.SpawnEnemy(enemyFac.Create());
		maze.SpawnEnemy(enemyFac.Create());
		maze.SpawnEnemy(enemyFac.Create());
		maze.SpawnEnemy(enemyFac.Create());
		maze.SpawnEnemy(enemyFac.Create());
		JoyStick controller = factory1.Create(player);
		controller.pressedA();
		controller.pressedB();
		if (!maze.bloqued())
		   controller.pressedC();
		controller.pressedDown();
		if (!maze.bloqued())
			   controller.pressedC();
		controller.pressedLeft();
		if (!maze.bloqued())
			   controller.pressedC();
		controller.pressedUp();
		if (!maze.bloqued())
			   controller.pressedC();
		controller.pressedRight();
		if (!maze.bloqued())
			   controller.pressedC();
	}
}
