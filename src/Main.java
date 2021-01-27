import Controllers.FightController;
import Model.Characters.Fightable;
import Model.Characters.Levelable;
import Model.Characters.Lootable;
import Model.Characters.enemy.Warrior;
import Model.Characters.player.Player;

public class Main {

    /**
     * @param args arguments fonction main
     */
    public static void main(String[] args) {

        Fightable p = new Player("Merlin", 1);
        Fightable e = new Warrior(2);

        System.out.println(p);
        System.out.println(e);

        FightController fc = new FightController(p, e);


        do {
            fc.fight(true);
        } while (p.isAlive() && e.isAlive());

        if (p.isAlive()) {
			((Levelable) p).addExp(((Lootable) e).expLootable());
		}

        System.out.println(p);
        System.out.println(e);


        System.out.println();

    }

}
