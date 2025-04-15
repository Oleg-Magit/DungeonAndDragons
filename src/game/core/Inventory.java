package game.core;
import game.items.GameItem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<GameItem> items;
    public Inventory() {
        items = new ArrayList<GameItem>();
    }
    public void addItem(GameItem item) {
        items.add(item);
        System.out.println(item.toString()+" added to Inventory");
    }
    public boolean removeItem (GameItem item) {
        if (!items.contains(item)) {
            return false;
        }
        items.remove(item);
        return true;
    }
    public List<GameItem> getItems() {
        return items;
    }
}
