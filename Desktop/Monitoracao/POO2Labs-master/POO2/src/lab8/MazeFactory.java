package lab8;

import lab5.Factory;

public class MazeFactory extends Factory {
	public Maze Create() {
		Maze maze = new Maze();
		for (int i=0; i<10; i++)
			for(int j=0; j<10; j++) {
				maze.SetWall(i, j, new WallFactory().create());
			}
		return maze;
	}
}
