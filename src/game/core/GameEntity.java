package game.core;

import game.map.Position;

/**
 * An interface representing any entity that appears on the game map.
 * Entities can be characters, enemies, items, walls, and more.
 * Every entity must be aware of its position, visibility state, and how to visually represent itself on the map.
 */
public interface GameEntity {

    /**
     * Returns the current position of the entity on the map.
     *
     * @return a Position object representing the entity's location.
     */
    Position getPosition();

    /**
     * Updates the position of the entity on the map.
     *
     * @param newPos the new Position to move the entity to.
     */
    void setPosition(Position newPos);

    /**
     * Returns a textual symbol used to represent the entity on the map.
     * For example: '@' for a player, '#' for a wall, '$' for treasure.
     *
     * @return a string representing the visual symbol of the entity.
     */
    String getDisplaySymbol();

    /**
     * Sets the visibility of the entity to the player (e.g. based on field of view).
     *
     * @param visible true if the entity should be visible; false if it should be hidden.
     */
    void setVisible(boolean visible);
}
