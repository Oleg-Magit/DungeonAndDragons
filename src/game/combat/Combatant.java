package game.combat;

public interface Combatant {
    int getHealth();
    void setHealth(int health);
    void receiveDamage (int amount, Combatant source);
}
