package lab2;
import lab2.Directions.*;

import java.util.ArrayList;
import java.util.Random;

public class Position {
	private int x;
	private int y;
	private Direction direction;
	
	public Position() {
		Random generator = new Random();
		this.x = generator.nextInt(10);
		this.y = generator.nextInt(10);
		switch (generator.nextInt(4)) {
		case 0:
			this.direction = new North();
		case 1:
			this.direction = new South();
		case 2:
			this.direction = new East();
		case 3:
			this.direction = new West();
		}
	}
	
	public static double distancePositions(Position a, Position b) {
		double x2 = Math.pow((a.getX() - b.getX()), 2);
		double y2 = Math.pow((a.getY() - b.getY()), 2);
		return Math.sqrt(x2 + y2);
	}
	
	public void goFoward(int n) {
		if (this.direction.getClass().equals(North.class)) {
			if (this.x + n < 10)
				this.x += n;
		}
		if (this.direction.getClass().equals(South.class)) {
			if (this.x - n >= 0)
				this.x -= n;
		}
		if (this.direction.getClass().equals(East.class)) {
			if (this.y + n < 10)
				this.y += n;
		}
		if (this.direction.getClass().equals(West.class)) {
			if (this.y - n >= 0)
				this.y -= n;
		}
	}
	
	public void showPosition() {
		System.out.print("Position X: " + this.x + " Y: " + this.y);
		if (this.direction != null)
			this.direction.facing();
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
