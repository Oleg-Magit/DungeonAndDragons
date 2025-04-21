package game.items;

import game.map.Position;

public class Wall extends GameItem {
    private final boolean blocksMovement= true;

    public Wall(Position position) {
        super (position, true,"#");
    }

    @Override
    public String toString() {
        return "Wall at " + getPosition() + " – blocks your way";
    }

}
