package justanothertuesday;

/**
 *
 * @author franc
 */
public class JustAnotherTuesday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Hello World!");
        Enemy subboss1 = new SubBoss("big goblin man", 300);
        Enemy subboss2 = new SubBoss("large bat", 300);
        
        System.out.println("Health Points of "+subboss2.mobName+""+subboss2.healthPoints);
        subboss1.dealsDamage();
        System.out.println(subboss1.mobName+" deals"+subboss1.dealsDamage());
        System.out.println("");
        
        
    }
    
}
