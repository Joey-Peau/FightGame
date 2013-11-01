import java.util.Random;

import Model.Characters.enemy.Warrior;


public class Principale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random r = new Random();


		System.out.println(new Warrior(100).itemLoot());

	}

}
