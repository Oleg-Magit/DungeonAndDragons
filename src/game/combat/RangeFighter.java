package game.combat;

public interface RangeFighter {
    void fightRange(Combatant target);
    int getRange();
    boolean isInRange(Position self,Position target);
}
