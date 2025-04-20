package game.combat;

/**
 * An interface representing an entity capable of performing magic attacks.
 * Entities implementing this interface can calculate magic damage, hold a magic element
 * (MagicElement), and compare elemental strength against other magic users.
 * Typically implemented by classes such as Mage, Dragon, etc.
 */
public interface MagicAttacker {

    /**
     * Calculates magic damage against a specific combat target.
     * The damage may be influenced by the attacker's element, magic power, or other factors.
     *
     * @param target the Combatant being attacked with magic.
     */
    void calculateMagicDamage(Combatant target);

    /**
     * Compares this entity's magic element with another MagicAttacker's element
     * to determine elemental advantage (e.g., fire is stronger than ice).
     *
     * @param other the other magic attacker to compare against.
     * @return true if this attacker's element is stronger; false otherwise.
     */
    boolean isElementStrongetThat(MagicAttacker other);

    /**
     * Returns the magic element associated with this entity.
     * For example: FIRE, ICE, ACID, etc.
     *
     * @return the MagicElement enum representing this entity's element.
     */
    MagicElement getElement();
}
