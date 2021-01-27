package Model.Characters.player;

import Model.Characters.Character;
import Model.Characters.Levelable;
import Model.Characters.Statable;

/**
 * Player Class
 *
 * @author joey
 */
public class Player extends Character implements Levelable {

    int expPoints;

    public Player(String name, int level) {
        super(level);
    }

    @Override
    public int calculatedMaxLifePoints() {
        return 1000;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int levelUp() {
        return this.level++;
    }

    @Override
    public Levelable addExp(int exp) {
        this.expPoints += exp;
        return this;
    }

    @Override
    public int getExp() {
        return this.expPoints;
    }

    @Override
    public int getExpForNextLevel() {
        return (int) (1000 * Math.random() * 10 * this.level);
    }

    @Override
    public Statable initStats() {
        super.initStats();

        this.setStrength(5);
        this.setAgility(5);
        this.setLuck(5);

        return this;
    }
}
