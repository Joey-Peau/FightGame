package Model.Characters;

public interface Fightable {

    /**
     * Initialise fighter life points and max life points
     *
     * @return the object itself
     */
    Fightable initLifePoints();

    /**
     * Is the fighter still alive
     *
     * @return true if still alive
     */
    boolean isAlive();

    /**
     * Check if next hit is a critical one
     *
     * @return true if critical
     */
    boolean isCriticalHit();

    /**
     * Fighter attack Points
     *
     * @return calculated attack points
     */
    int getAttackPoints();

    /**
     * Fighter defense Points
     *
     * @return calculated defense points
     */
    int getDefensePoints();

    /**
     * Function to know how much life points is really removed
     *
     * @param base_lp_to_remove original Life points to remove
     * @return new calculated life points to remove
     */
    int realRemoval(int base_lp_to_remove);

    /**
     * Remove life
     *
     * @param lp_to_remove life points to remove
     * @return real life points removed
     */
    int removeLife(int lp_to_remove);

    /**
     * Adds life
     *
     * @param lp_to_add life points to add
     * @return real life points added
     */
    int add_life(int lp_to_add);

    /**
     * Get current Fighter life points
     *
     * @return current life points
     */
    int getLifePoints();

    /**
     * Get fighter max life points allowed
     *
     * @return max Life points allowed
     */
    int getMaxLifePoints();

    /**
     * Get fighter calculated Max Life points allowed
     *
     * @return calculated MaxLifePoints
     */
    int calculatedMaxLifePoints();

    /**
     * Attack an ememy
     *
     * @param enemy      enemy to attack
     * @param isCritical check if it's a critical hit
     * @return Life point removed to the enemy
     */
    int attack(Fightable enemy, boolean isCritical);

}
