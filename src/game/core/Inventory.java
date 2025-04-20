package game.core;

import game.items.GameItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an inventory system for storing in-game items.
 * Each inventory holds a list of {@link GameItem} objects that the character can collect and use.
 * Typical use cases include players collecting potions, treasure, or other usable items.
 * This class provides methods for adding, removing, and retrieving stored items.
 */
public class Inventory {

    /**
     * The list of items currently held in the inventory.
     */
    private List<GameItem> items;

    /**
     * Constructs an empty inventory.
     */
    public Inventory() {
        items = new ArrayList<GameItem>();
    }


    /**
     * Returns a string representation of the inventory and its items.
     * Useful for debugging, logging, or displaying inventory contents to the user.
     * @return a comma-separated list of item descriptions.
     */
    @Override

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Inventory: ");
        for (GameItem item : items) {
            sb.append(item.toString()).append(", ");
        }
        return sb.toString();
    }

    /**
     * Adds a new item to the inventory.
     *
     * @param item the {@link GameItem} to be added.
     */
    public void addItem(GameItem item) {
        items.add(item);
        System.out.println(item.toString() + " added to Inventory");
    }

    /**
     * Removes an item from the inventory, if it exists.
     *
     * @param item the {@link GameItem} to be removed.
     * @return true if the item was present and removed; false otherwise.
     */
    public boolean removeItem(GameItem item) {
        if (!items.contains(item)) {
            System.out.println(item.toString() + " not in Inventory");
            return false;
        }
        items.remove(item);
        System.out.println(item.toString() + " removed from Inventory");
        return true;
    }

    /**
     * Returns the list of all items currently in the inventory.
     *
     * @return a List of {@link GameItem} objects.
     */
    public List<GameItem> getItems() {
        System.out.println(items.toString());
        return new ArrayList<>(items);
    }
}
