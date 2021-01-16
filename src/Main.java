import Model.Characters.Fightable;
import Model.Characters.enemy.Warrior;
import Model.Characters.player.Player;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Fightable p = new Player("Merlin", 1);
		Fightable e = new Warrior(3);

		System.out.println(p);
		System.out.println(e);



		System.out.println();

	}

}
