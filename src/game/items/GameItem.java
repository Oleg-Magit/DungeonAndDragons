package game.items;

import game.core.GameEntity;
import game.map.Position;
import java.util.Objects;

/**
 * Represents a basic item in the game—an object that exists on the map.
 * An item may be a potion, wall, treasure, or any non-character entity.
 * Implements the {@link GameEntity} interface and stores position, blocking behavior,
 * and a textual description used also as a visual symbol.
 * This class serves as a base for more advanced item types.
 */
public class GameItem implements GameEntity {

    /**
     * The item's current position on the map.
     */
    private Position position;

    /**
     * Indicates whether the item blocks movement (true = cannot pass through).
     */
    private boolean blocksMovement;

    /**
     * Textual description of the item (also used as its visual symbol on the map).
     * This value is final and cannot be changed after construction.
     */
    private final String description;

    /**
     * Constructs a new item with a specified position, description, and movement blocking status.
     * @param position       the initial position of the item.
     * @param blocksMovement whether the item blocks movement.
     * @param description    a string representing the item's description and symbol.
     */
    public GameItem(Position position, boolean blocksMovement, String description) {
        this.position = position;
        this.blocksMovement = blocksMovement;
        this.description = description;
    }

    /**
     * Returns the item's textual description.
     * Also used for display purposes and logging.
     * @return a string describing the item.
     */
    @Override
    public String toString() {
        return description;
    }

    /**
     * Determines whether this GameItem is equal to another object.
     * Two GameItem instances are considered equal if they have the same description,
     * regardless of their position or whether they block movement.
     * This implementation is useful when comparing items by type or label
     * (e.g., all items with the description "Potion" are considered the same kind of item).
     * Note: This method must be used consistently with {@link #hashCode()}, which also relies only on the description field.
     * @param o the object to compare to this item.
     * @return true if the given object is a GameItem with the same description; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameItem other = (GameItem) o;
        return description.equals(other.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Position getPosition() {
        return position;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPosition(Position newPos) {
        position = newPos;
    }

    /**
     * {@inheritDoc}
     * In this implementation, the item's description is used as its display symbol
     * (e.g., '@' or '$').
     * @return the symbol that visually represents the item.
     */
    @Override
    public String getDisplaySymbol() {
        return description;
    }

    /**
     * {@inheritDoc}
     * In this implementation, the visibility status updates the blocksMovement field,
     * for demonstration purposes only.
     * In future versions, it's recommended to separate visibility from movement blocking.
     * @param visible true if the item should be visible; false otherwise.
     */
    @Override
    public void setVisible(boolean visible) {
        blocksMovement = visible;
    }
}
