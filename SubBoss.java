public class SubBoss extends Enemy
{
  
   public int healthPoints;

    public SubBoss(String name, int healthPoints) {
        super(name);
        healthPoints = 300;
    }
    
   
    
    public void setHealthPoints(int healthPoints)
    {
        this.healthPoints = healthPoints;
    }

  
  

    @Override
    public int dealsDamage() 
    {
        
        Random rand = new Random();
    int rand_int1 = rand.nextInt(20);
    if (rand_int1 < 9) 
      {
        return this.damage =  50;
      }
    else 
      {
         return this.damage = 0;
      }
    }
    
    @Override
    public void takesDamage()
    {
        this.healthPoints -= this.damage;
        
    }

 }
