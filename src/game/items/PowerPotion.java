package game.items;
import game.map.Position;
import java.util.Random;

public class PowerPotion extends Potion {
    public PowerPotion(Position position) {
        super  (position);
        Random rand = new Random();
        int randomIncreasePower = rand.nextInt(5) +1;
        this.setIncreaseAmount(randomIncreasePower);
    }

    @Override
    public String toString() {
        return "Power Potion add you a (" + this.getIncreaseAmount() + " Power)";
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof PowerPotion){
            PowerPotion p = (PowerPotion)obj;
            return this.getIncreaseAmount() == p.getIncreaseAmount();
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(this.getIncreaseAmount());
    }
}
