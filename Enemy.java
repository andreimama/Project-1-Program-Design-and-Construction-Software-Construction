public abstract class Enemy
{
  public String mobName = "";
  public int healthPoints = 0;
  public int damage = 0;

  public Enemy(String name) 
  {
    this.mobName = name;
    
  }  
  
  public void setName(String newName) {
        this.mobName = newName;
    }
  


public abstract int dealsDamage();

public abstract void takesDamage();
}
