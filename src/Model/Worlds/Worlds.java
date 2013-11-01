package Model.Worlds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import Model.Characters.enemy.Enemy;

public class Worlds {
	Random r = new Random();

	// current World
	Worlds current;

	// lvl's Boundaries
	protected int levelInf, levelSup;
	
	//enemies present in this world
	protected ArrayList<Enemy> enemies;
	

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
		enemies = new ArrayList<Enemy>();
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
	
	public int[] caractWorld(){
		int[] hm = new int[]{0,0,0,0,0,0,0,0,0,0};
		for(Enemy n : enemies){
			if(n.getLevel()<=10)
				hm[0]++;
			else if(n.getLevel()<=20)
				hm[1]++;
			else if (n.getLevel()<=30)
				hm[2]++;
			else if (n.getLevel()<=40)
				hm[3]++;
			else if (n.getLevel()<=50)
				hm[4]++;
			else if (n.getLevel()<=60)
				hm[5]++;
			else if (n.getLevel() <= 70)
				hm[6]++;
			else if (n.getLevel() <= 80)
				hm[7]++;
			else if (n.getLevel() <= 90)
				hm[8]++;
			else if (n.getLevel() <= 100)
				hm[9]++;
		}
		
		return hm;
			
	}

}
