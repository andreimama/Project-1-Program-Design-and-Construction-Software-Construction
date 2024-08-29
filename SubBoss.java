

import java.util.Random;

/**
 *
 * @author mamar
 */
public class SubBoss extends Enemy
{
      public SubBoss(String name, int healthPoints) 
    {
        super(name, healthPoints);
    }
    
    public void setHealthPoints(int healthPoints)
    {
        this.healthPoints = healthPoints;
    }


    @Override
    public int dealsDamage() {
        return this.damage = 30;
    /*   Random rand = new Random();
    int rand_int1 = rand.nextInt(20);
    if (rand_int1 < 9) 
      {
        return this.damage =  50;
      }
    else 
      {
         return this.damage = 0;
      } */
    } 
    
    @Override
    public int takesDamage(int damage)
    {
        this.healthPoints -= damage;
        return this.healthPoints;
        
    }

 }
