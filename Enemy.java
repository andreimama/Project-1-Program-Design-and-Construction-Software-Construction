public abstract class Enemy
{
  public String mobName = "";

  public Enemy(String name) 
  {
    this.mobName = name;
  }  


public abstract void dealsDamage();

}
