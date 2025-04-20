package game.characters;
import game.core.GameEntity;
import game.combat.Combatant;
import game.map.Position;

/**
 * abstract base class for all characters in the game (players ,enemies)
 * implements shared logic for game entity and combatant
 */
public abstract class AbstractCharacter implements GameEntity , Combatant {
    private String name;
    private int health;
    private int power;
    private Position position;

    /**
     * constructor
     * @param name
     * @param health
     * @param power
     * @param position
     */
    public AbstractCharacter(String name,int health,int power, Position position){
        this.name=name;
        this.health=health;
        this.power=power;
        this.position=position;
    }

   // GameEntity methods -
    @Override
    public Position getPosition(){
        return position;
    }
    @Override
    public void setPosition( Position newPosition){
        this.position = newPosition;
    }
    @Override
    public String getDisplaySymbol()
    {
        return "?";
    }
    @Override
    public void setVisible (boolean visible){

    }
    // Combatant methods-
    @Override
    public int getHealth(){
        return health;
    }
    @Override
    public void setHealth( int health){this.health = health;}
    @Override
    public int getPower() {return power;}
    @Override
    public void receiveDamage(int amount,Combatant source) {
        this.health-=amount;
        System.out.println(name+" received "+ amount + " damage from "+ source);
    }
    @Override
    public void heal(int amount ){
        this.health+=amount;
        System.out.println(name+"healed"+ amount + "HP");
    }
    @Override
    public boolean isDead(){return health<=0;}
    @Override
    public String toString(){ return name + "[HP:" + health +", Power "+ power+ "]";}
    //accessors -
    public String getName(){return name;}
    public void setPower(int newPower){
        this.power=newPower;

    }
    











}
