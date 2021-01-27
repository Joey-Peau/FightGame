package Model.Characters;

public interface Levelable {

    /**
     * getter for current level
     *
     * @return current level
     */
    int getLevel();

    /**
     * Level up
     *
     * @return number of level upped
     */
    int levelUp();

    /**
     * Add experience points
     *
     * @param exp experience points to add
     * @return the object itself
     */
    Levelable addExp(int exp);

    /**
     * Getter for current experience points
     *
     * @return current experience
     */
    int getExp();

    /**
     * Total Experience needed before next level
     *
     * @return experience total to earn
     */
    int getExpForNextLevel();


}
