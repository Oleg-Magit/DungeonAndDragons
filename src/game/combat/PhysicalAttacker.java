package game.combat;

/**
 * An interface representing an entity capable of performing physical attacks.
 * Such entities use physical strength (non-magical) to inflict damage on opponents.
 * Suitable for characters like Warrior, Archer, Goblin, Orc, Dragon, etc.
 * The interface includes a basic attack method and a check for critical hits.
 */
public interface PhysicalAttacker {

    /**
     * Performs a physical attack on a given target.
     * The amount of damage may vary based on strength, character type,
     * or whether the hit is critical.
     *
     * @param target the Combatant being attacked.
     */
    void attack(Combatant target);

    /**
     * Determines whether the current attack is a critical hit.
     * A critical hit usually deals increased or double damage.
     *
     * @return true if the attack is critical; false otherwise.
     */
    boolean isCritical();
}
