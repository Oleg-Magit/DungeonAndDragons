package game.items;

import game.core.GameEntity;
import game.map.Position;

public class GameItem implements GameEntity {
    private Position position;
    private boolean blocksMovement;
    private String description;
    public Position getPosition(){ return position; }
    public void setPosition(Position newPos){ position = newPos; }
    public String getDisplaySymbol(){ return description; }
    public void setVisible(boolean visible) { blocksMovement = visible; }
}
