package game.combat;

public interface MeleeFighter {
    void fightClose (Combatant target);
    boolean isInMeleeRange (Position self,Position target);
}
