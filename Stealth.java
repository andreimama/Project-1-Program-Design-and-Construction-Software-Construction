


import java.util.Random;

/**
 *
 * @author franc
 */
public class Stealth implements Heroes {
    private final String name ;
    private int health;
    private int dealDamage;
    
    public Stealth(){
        this.name = "Sir Sneaksalot";
        this.health = 100;
        this.dealDamage = 30;
    }
    @Override
    public void takesDamage(int amount){
        this.health = this.getHealth() - amount;
    }
    @Override
    public void powerUp(int amount){
        this.dealDamage = this.getDealDamage() + amount;
    }
    public int criticalHit(){
        Random rand = new Random();
        int chance = rand.nextInt(20);
        if(chance<10){
            
            return dealDamage + 50;
        }
        return dealDamage;
        
    } 
    public void addHealth(Boolean thing, int amount){
        if(thing){
            this.health += amount;
        }
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
     * @return the dealDamage
     */
    public int getDealDamage() {
        return dealDamage;
    }
}
