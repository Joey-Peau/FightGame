package Model.Worlds;

import java.util.ArrayList;

import Model.Characters.enemy.Enemy;

public class Worlds {

	// current World
	Worlds current;

	// lvl's Boundaries
	int levelInf, levelSup;
	
	//enemies present in this world
	ArrayList<Enemy> enemies;
	

	/**
	 * Create the world in witch enemies will be between levelInf and levelSup
	 * 
	 * @param linf
	 *            minimal enemy level
	 * @param bsup
	 *            maximal enemy level
	 */
	public Worlds(int linf, int bsup) {
		levelInf = linf;
		levelSup = bsup;
	}

	/**
	 * Minimal level getter
	 * @return minimal level's world
	 */
	public int getInf() {
		return levelInf;
	}
/**
 * Maximal enemies level in this world
 * @return world's maximal level
 */
	public int getSup() {
		return levelSup;
	}
	
	/**
	 * Getter for the enemies list
	 * @return enemies in the world
	 */
	public ArrayList<Enemy> getListEnemies(){
		return enemies;
	}

}
