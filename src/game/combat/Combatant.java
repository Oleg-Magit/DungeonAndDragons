package game.combat;

/**
 * An interface representing a combat-capable entity (e.g., player or enemy)
 * that can participate in battles.
 * A Combatant holds health, attack power, evasion capability, and can receive or heal damage.
 * This interface forms the basis of the game's combat system and is implemented
 * by entities such as AbstractCharacter and its subclasses.
 *
 */
public interface Combatant {

    /**
     * Returns the current health of the entity.
     * Valid range is typically from 0 to 100.
     *
     * @return the current health value.
     */
    int getHealth();

    /**
     * Sets the entity's current health value.
     * Implementations may include validation logic (e.g., limiting max health to 100).
     *
     * @param health the new health value.
     */
    void setHealth(int health);

    /**
     * Applies damage to the entity during combat.
     * The source of the damage is passed as a Combatant to allow effects like
     * resistances or counters based on attacker type.
     *
     * @param amount the amount of damage to apply.
     * @param source the entity that caused the damage.
     */
    void receiveDamage(int amount, Combatant source);

    /**
     * Heals the entity by a given amount.
     * Usually used after consuming a potion or casting a healing spell.
     *
     * @param amount the amount of health to restore.
     */
    void heal(int amount);

    /**
     * Checks whether the entity is dead (health is zero or less).
     *
     * @return true if the entity is dead; false otherwise.
     */
    boolean isDead();

    /**
     * Returns the base attack power of the entity.
     * This value is used when calculating outgoing damage.
     *
     * @return the attack power value.
     */
    int getPower();

    /**
     * Attempts to evade an incoming attack.
     * This method returns true if the evasion attempt succeeds.
     * Evasion probability may vary depending on the character's stats.
     *
     * @return true if evasion is successful; false otherwise.
     */
    boolean tryEvade();
}
