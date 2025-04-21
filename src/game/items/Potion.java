package game.items;

import java.util.Random;
import game.map.Position;


/**
 * A potion that restores health when used.
 */
public class Potion extends GameItem implements Interactable{
    private int increaseAmount;
    private boolean isUsed;

    /**
     * Sets a new healing amount (used by subclasses if needed).
     * increaseAmount new healing value.
     */
    public Potion(Position position){
        super(position,true,"&");
        Random rand = new Random();
        this.increaseAmount = rand.nextInt(31)+20;
    }

    /**
     * Sets a new healing amount (used by subclasses if needed).
     * @param amount new healing value.
     */
    public void setIncreaseAmount(int amount) {
        this.increaseAmount = amount;
    }

    /**
     * Returns the amount of HP this potion heals.
     * @return the healing amount.
     */
    public int getIncreaseAmount() {
        return increaseAmount;
    }

    /**
     * Marks the potion as used.
     */
    public void use(){
        isUsed = true;
    }

    /**
     * Checks if the potion has been used.
     * @return true if used, false otherwise.
     */
    public boolean isUsed() {
        return isUsed;
    }

    @Override
    public void interact(Character c) {

    }

    @Override
    public String toString() {
        return "Healing Potion add you (" + increaseAmount + " HP)";
    }

}
