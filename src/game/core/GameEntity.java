package game.core;

public interface GameEntity {
    Position getPosition();
    void setPosition(Position newPos);
    String getDisplaySymbol();
    void setVisible(boolean visible);
}
