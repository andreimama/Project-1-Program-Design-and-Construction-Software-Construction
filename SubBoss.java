// Java program for random number generation
import java.util.Random;


public class SubBoss extends Enemy
{
  string
  int healthPoints;


  @Override
  public void dealDamage() {
  Random rand = new Random();
  int rand_int1 = rand.nextInt(20);
  if (rand_int1 < 9) 
    {
       this.damage =  5;
    }
  else 
    {
        this.damage = 0;
    {
}
