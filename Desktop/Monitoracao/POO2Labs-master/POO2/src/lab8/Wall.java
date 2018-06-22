package lab8;

import lab2.Position;

import java.util.ArrayList;

import lab2.Direction;

public class Wall {
	
	protected ArrayList<Direction> bloquedDirections = new ArrayList<Direction>();
	
	public Wall(ArrayList<Direction> bloquedWalls) {
		this.bloquedDirections.addAll(bloquedWalls);
	}
	
	public boolean bloquedPath(Position position) {
		for (Direction direction : bloquedDirections) {
			if (position.getDirection().getClass().equals(direction.getClass())) {
				return true;
		    }
		}
		return false;
	}
}
