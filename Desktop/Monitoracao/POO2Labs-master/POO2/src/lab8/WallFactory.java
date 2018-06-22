package lab8;

import java.util.ArrayList;
import java.util.Random;

import lab2.Direction;
import lab2.Directions.*;
import lab8.Wall;

public class WallFactory {
	public Wall create() {
		Wall wall = new Wall(this.createDirections());
		return wall;
	}
	
	private ArrayList<Direction> createDirections() {
		ArrayList<Direction> directions = new ArrayList<Direction>();
		Random generator = new Random();
		int n = generator.nextInt(8);
		if (n == 1) {
			directions.add(new North());
		}
		if (n == 2) {
			directions.add(new South());
		}
		if (n == 3) {
			directions.add(new East());
		}
		if (n == 4) {
			directions.add(new West());
		}
		return directions;
	}
}
