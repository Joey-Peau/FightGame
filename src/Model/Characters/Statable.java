package Model.Characters;

public interface Statable {

    int strength = 0, luck = 0, agility = 0;

    Statable initStats();

    int getStrength();

    Statable setStrength(int value);

    int getLuck();

    Statable setLuck(int value);

    int getAgility();

    Statable setAgility(int value);

}
