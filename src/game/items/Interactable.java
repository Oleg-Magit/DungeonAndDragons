package game.items;

/**
 * An interface representing an interactive object on the game map—
 * meaning an item or entity that a player can interact with (e.g., collect, activate, use).
 * Items implementing this interface respond when the player gets close to them
 * or explicitly uses them.
 * Examples include: healing potions, treasure, traps, or special obstacles
 * This interface allows handling of interactive objects in a consistent way,
 * regardless of their specific type.
 */
public interface Interactable {

    /**
     * Triggers an interaction when a player encounters or activates the item.
     * Each item may implement this behavior differently:
     * for example, a potion may heal the player, a treasure may give points,
     * and a trap may deal damage.
     *
     * @param c the Character object that is performing the interaction.
     */
    void interact(Character c);
}
