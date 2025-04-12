package game.combat;

public interface Combatant {
    int getHealth();
    void setHealth(int health);
    void receiveDamage (int amount, Combatant source);
    void heal (int amount);
    boolean isDEad();
    int getPower();
    boolean tryEvade();
}

