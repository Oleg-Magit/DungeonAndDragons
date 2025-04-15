package game.combat;
import game.map.Position;

public interface RangeFighter {
    void fightRange(Combatant target);
    int getRange();
    boolean isInRange(Position self,Position target);
}
