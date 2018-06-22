package lab8;

import lab5.Character;

import java.util.ArrayList;

import lab4.Enemy;

public class Maze {
	protected Wall walls[][] = new Wall[10][10];
	protected ArrayList<Enemy> enemys = new ArrayList<Enemy>();
	protected Character player;
	
	public void SpawnEnemy(Enemy enemy) {
		if (this.player != null)
			enemy.Observer(this.player);
		enemys.add(enemy);
	}
	
	public void SpawnPlayer(Character player) {
		this.player = player;
	}
	
	public void SetWall(int x,int y, Wall wall) {
		this.walls[x][y] = wall;
	}
	
	public boolean bloqued () {
		for (int i=0; i< walls.length; i++)
			for(int j=0; j < walls[0].length; j++) {
				if (i == this.player.getPosition().getX() && j == this.player.getPosition().getY()) {
					return walls[i][j].bloquedPath(this.player.getPosition());
				}
			}
		System.out.print("Vc encontrou uma parede");
		return false;
	}
}
