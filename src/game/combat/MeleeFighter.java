package game.combat;

import game.map.Position;

/**
 * An interface representing a melee fighter (close-range combat unit).
 * Entities that implement this interface can perform close-combat attacks
 * and check whether a target is within melee range.
 * Common examples include: Warrior, Goblin, Orc, etc.
 */
public interface MeleeFighter {

    /**
     * Performs a melee attack on a nearby target.
     * The attack is only valid if the target is within melee range
     * (typically when distance == 1).
     *
     * @param target the Combatant being attacked.
     */
    void fightClose(Combatant target);

    /**
     * Checks whether the target is within melee range relative to the attacker's position.
     * Usually used to validate whether a close-combat attack is allowed.
     *
     * @param self   the attacker's current position.
     * @param target the target's position.
     * @return true if the target is within melee range; false otherwise.
     */
    boolean isInMeleeRange(Position self, Position target);
}
