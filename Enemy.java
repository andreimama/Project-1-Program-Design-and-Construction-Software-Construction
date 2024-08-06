/**
 *
 * @author mamar
 */
public abstract class Enemy
{
  public String mobName = "";
  public int healthPoints;
  public int damage;

  public Enemy(String name, int healthPoints )
  {
    this.mobName = name;
    this.healthPoints = healthPoints;
    
  }  
  
  public void setName(String newName) {
        this.mobName = newName;
    }
  
  public void attack(Enemy target)
  {
      int damageDealt = this.dealsDamage();
      
      target.takesDamage(damageDealt);
      
  }

public abstract int dealsDamage();

public abstract int takesDamage(int damage);
}
