
/**
 *
 * @author franc
 */
public class Medic implements Heroes{
    private final String name;
    private int health;
    private int dealsDamage;

    public Medic() {
        this.name = "Charity";
        this.health = 100;
        this.dealsDamage = 20;
    }
    @Override
    public void takesDamage(int amount){
        health -= amount;
    }
    @Override
    public void powerUp(int amount){
        dealsDamage+=amount;
    }
    public void addHealth(Boolean thing,int amount){
        this.health += amount;
    }
    public void heal(Heroes hero,int amount){
        hero.addHealth(true,amount);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return the dealsDamage
     */
    public int getDealsDamage() {
        return dealsDamage;
    }
    
}
