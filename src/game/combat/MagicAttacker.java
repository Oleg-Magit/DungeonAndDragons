package game.combat;

public interface MagicAttacker {
    void calculateMagicDamage(Combatant target);
    boolean isElementStrongetThat(MagicAttacker other);
    MagicElement getElement();
}
