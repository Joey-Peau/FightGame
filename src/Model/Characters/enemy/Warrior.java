package Model.Characters.enemy;

import Model.Characters.Statable;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Warrior enemy Class
 *
 * @author joey
 */
public class Warrior extends Enemy {

    final int HIGH_STRENGTH = 10;
    final int LOW_STRENGTH = 5;

    final int HIGH_AGILITY = 5;
    final int LOW_AGILITY = 2;

    final int HIGH_LUCK = 1;
    final int LOW_LUCK = 0;

    public Warrior(int level) {
        super(level);
    }

    @Override
    public Statable initStats() {
        ThreadLocalRandom r = ThreadLocalRandom.current();

        this.setStrength(r.nextInt(LOW_STRENGTH, HIGH_STRENGTH + 1));
        this.setAgility(r.nextInt(LOW_AGILITY, HIGH_AGILITY + 1));
        this.setLuck(r.nextInt(LOW_LUCK, HIGH_LUCK + 1));

        return this;
    }

    @Override
    public int expLootable() {
        return (int) (Math.random() * 100) * this.level;
    }
}
