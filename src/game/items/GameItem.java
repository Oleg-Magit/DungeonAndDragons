package game.items;

import game.core.GameEntity;
import game.map.Position;

public class GameItem implements GameEntity {
    private Position position;
    private boolean blocksMovement;
    private final String description;
    public GameItem(Position position, boolean blocksMovement, String description) {
        this.position = position;
        this.blocksMovement = blocksMovement;
        this.description = description;
    }
    @Override
    public String toString() {
        return description;
    }

    @Override
    public Position getPosition(){ return position; }
    @Override
    public void setPosition(Position newPos){ position = newPos; }
    @Override
    public String getDisplaySymbol(){ return description; }
    @Override
    public void setVisible(boolean visible) { blocksMovement = visible; }
}
