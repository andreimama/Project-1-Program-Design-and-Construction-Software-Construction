/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author mamar
 */

public class Scenarios {
//This is encapsulation, uses private fields to hide details, (public methods are in the class so it can be interactable)
    private UserInteraction userInteraction;
    private GameState gameState;
    private mainDude main;
    private Medic medic;
    private Stealth stealth;
    private Tank tank;
    private SubBoss wormman;
    private GameSaver gameSaver;
    private GameLoader gameLoader;
    private InputHandler inputHandler;
    private Saving saving;
    
    /*Scenarios uses gamestate to determine what part of the game to run
    and usesInterface to interact with user(print msg)
    */
    public Scenarios(UserInteraction userInteraction, GameState gameState) {
        //Creating instances
        this.main = new mainDude("", 0);
        this.medic = new Medic();
        this.stealth = new Stealth();
        this.tank = new Tank();
        this.wormman = new SubBoss("Worm Man", 100);
        //this.gameSaver = new GameSaver(Saving);
        this.inputHandler = new InputHandler();
        this.userInteraction = userInteraction;
        this.gameState = gameState;
        
        //instantiante saving, GameSaver, the GameLoader
        this.saving = new Saving();
        this.gameSaver = new GameSaver(saving);
        this.gameLoader = new GameLoader(saving);
    }
    
    
    public void scenarioOne() {
        userInteraction.showMessagePlusDelay("\nMysterious voice: wake up...wake up...WAKE UP. We need to get out of here !", 1000);
                userInteraction.showMessagePlusDelay("\nWhats your name?", 1000);
                String name = inputHandler.getStringInput();
                main.setName(name);
                
                userInteraction.showMessagePlusDelay("Mysterious voice: Cmon " + main.getName() + " We need to get to a... Oh no look out!\n", 1500);
                userInteraction.showMessagePlusDelay("Infront of you approaching fast is some sort of half human, half alien.\nThere is a gun on the table next to you.\n", 2000);

                int choice = inputHandler.getInt("What do you do?\n(1) Grab gun\n(2) Hide behind the mysterious person\n", 1, 2);
                if (choice == 1) {
                    userInteraction.showMessagePlusDelay(userInteraction.getScenario1Case1(),1000);
                    main.powerUp(30);
                    main.getsWeapon(Boolean.TRUE, choice);
                    gameState.setDesc(3);
                    gameSaver.saveGameState(gameState.getDesc(), main, medic, stealth, tank);

                } else if (choice == 2) {
                    userInteraction.showMessagePlusDelay(userInteraction.getScenario1Case2(),1000);
                    medic.takesDamage(40);
                    main.powerUp(30);
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    gameState.setDesc(3);
                }
    }

    public void scenarioTwo() {
        userInteraction.showMessagePlusDelay("\nMysterious voice: That was close, come with me I'm a doctor and I can help you", 2000);
        userInteraction.showMessagePlusDelay("\nThe mysterious person explains that you have been asleep for 20 years and in that time the world\nwas overrun with a parasitic alien species from one of Jupiter's moons.", 3000);
        userInteraction.showMessagePlusDelay("\nMysterious voice: My name is Charity by the way. We are going to the FBI HeadQuarters where Angelo, the head can explain more...\n", 3000);
        userInteraction.showMessagePlusDelay(tank.getName() + ": Mumbling to himself over a map...Ah Charity, I see you've brought a guest !\n", 2000);
        userInteraction.showMessagePlusDelay(medic.getName() + ": This is " + main.getName() + ", I found him in the 69th quadrant he might be of some use.\n", 2000);
        userInteraction.showMessagePlusDelay(tank.getName() + ": " + main.getName() + ", we need all the help we can get. Parasites are taking over Earth, and we have lost most of the population. \n", 2000);
        userInteraction.showMessagePlusDelay(main.getName() + ": Yep, why not?\n", 2000);
        userInteraction.showMessagePlusDelay(tank.getName() + ": Great!. you've met our doctor Charity. I'm Angelo, the tank and the leader. Lets meet our final member and head out.\n", 2000);
        //
        userInteraction.showMessagePlusDelay("You reach a house of the final member, the house almost camoflauged with its environment. \n", 5000);
        
        int choice = inputHandler.getInt("What do you do?\n(1) Go through the back window\n(2) Go through the front door\n", 1, 2);
        switch (choice) {
            case 1:
                    userInteraction.showMessagePlusDelay(userInteraction.getScenario2Case1(),1000);
                    stealth.powerUp(5);
                    main.powerUp(10);
                    gameState.setDesc(3);
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    break;

            case 2:
                    userInteraction.showMessagePlusDelay(userInteraction.getScenario2Case2(),1000);
                    main.takesDamage(20);
                    main.powerUp(10);
                    gameState.setDesc(3);
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    break;
                }
        //userInteraction.showMessagePlusDelay();

    }
    
    public void scenarioThree() {
        userInteraction.showMessagePlusDelay("\n\nTexan Voice: New member? Howdy I'm " + stealth.getName() + ", nice to meet ya.\n",2000);
        userInteraction.showMessagePlusDelay(stealth.getName() + ": Even if we about to leave to attack the heart of them parasites, more folks is always a good thing.\n", 2000);
        userInteraction.showMessagePlusDelay(tank.getName() + ": Good, we'll use the map to portal to go to jupiters moon where the parasite leader is.\n", 4000);
        userInteraction.showMessagePlusDelay("You reach the end of the portal entrance and see a human with a worm for a head.", 2000);
        
        userInteraction.showMessagePlusDelay("\nHealth of " + wormman.getName() +": " + wormman.getHealth(), 2000);
        
        int attackifCrit = stealth.getDealDamage() + 15;
        int choice = inputHandler.getInt("\nWhat do you do\n(1) Get " + stealth.getName() + " to launch a Suprise attack(" + stealth.getDealDamage() + "dmg) with a Chance to crit (30% chance - " + attackifCrit + "dmg)"
                    + "\n(2) Launch a swing with all of your might (" + main.getDealDamage() + "dmg)" 
                    + "\n(3) Ignore worm man and Try sneak into the portal with the party \n", 1, 3);
        
        
        //Gets name and health points to printout when calling the specific ScenarioCase
        
        switch (choice) {
            case 1:
                    //calls criticalHit() which just if it his a critical or not and adds extra dmg if it is crit
                    
                    //criticalHit calculates if damage is a crit or not, then wormman takes damage.
                    int ifCrit = stealth.criticalHit();
                    wormman.takesDamage(ifCrit);
                    String case1msg = userInteraction.getPrintAttack(stealth.getName(), ifCrit, wormman.getHealth(), wormman.getName());
                    userInteraction.showMessagePlusDelay(case1msg, 1000);
                    gameState.setDesc(4);
                    
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    break;
            
            case 2:
                    
                    wormman.takesDamage(main.getDealDamage());
                    String case2msg = userInteraction.getPrintAttack(main.getName(), main.getDealDamage(), wormman.getHealth(), wormman.getName());
                    userInteraction.showMessagePlusDelay(case2msg, 1000);
                    gameState.setDesc(4);
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    break;
            case 3:
                
                    String case3msg = userInteraction.getScenario3Case3(medic.getName());
                    userInteraction.showMessagePlusDelay(case3msg, 1000);
                    gameState.setDesc(4);
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    break;
            }
    
    
    }
    
    public void scenarioFour() {
        int charge_up = 0;
        while (wormman.getHealth() > 0 && charge_up != 3) {
                    userInteraction.showMessagePlusDelay("\nWorm Man whips his head towards " + tank.getName() + " and deals (" + wormman.dealsDamage() +"dmg)", 1000);
                    
                    userInteraction.showMessagePlusDelay("\nHealth of "+ tank.getName()  +": " + tank.getHealth(), 1000);
                    tank.takesDamage(wormman.dealsDamage());
                    userInteraction.showMessagePlusDelay("\nHealth of "+ tank.getName()  +": " + tank.getHealth(), 1000);
                    
                    userInteraction.showMessagePlusDelay("\nHealth of " + wormman.getName() +": " + wormman.getHealth(), 2000);
                    
                    //userInteraction.sho);
                            
                    int choice = inputHandler.getInt("\nWhat do you do\n(1) Get " + tank.getName() + " to launch a heavy attack" + tank.getDealDamage() + "dmg)" 
                    + "\n(2) Swing ur fists at the enemy (" + main.getDealDamage() + "dmg)" 
                    + "\n(3) Have " + medic.getName() + " Heal " + tank.getName() + " for 20HP", 1, 3);
                    
                    switch (choice) {
            case 1:
                    //
                
                    wormman.takesDamage(tank.getDealDamage());
                    String case1msg = userInteraction.getPrintAttack(tank.getName(), tank.getDealDamage(), wormman.getHealth(), wormman.getName());
                    userInteraction.showMessagePlusDelay(case1msg, 1000);
                    gameState.setDesc(4);
                    charge_up++;
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    break;
            
            case 2:
                    
                    wormman.takesDamage(main.getDealDamage());
                    String case2msg = userInteraction.getPrintAttack(main.getName(), main.getDealDamage(), wormman.getHealth(), wormman.getName());
                    userInteraction.showMessagePlusDelay(case2msg, 1000);
                    gameState.setDesc(4);
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    charge_up++;
                    break;
            case 3:
                    
                    tank.addHealth(Boolean.TRUE, 20);
                    String case3msg = userInteraction.getScenario4Case3(medic.getName(), tank.getName(), tank.getHealth());
                    userInteraction.showMessagePlusDelay(case3msg, 1000);
                    gameState.setDesc(4);
                    //gameSaver.saveGameState(desc, main, medic, stealth, tank);
                    charge_up++;
                    break;
            }
        }if (wormman.getHealth() <= 0) {
            gameState.setDesc(5);
            
        } else if (charge_up == 3) {
            userInteraction.showMessagePlusDelay("\n\n" +wormman.getName() + " Does a 360 triple backflip whip that deals instantly kills all members",0);
            gameState.setDesc(-1);

        }
   
    }
    
    public void scenarioLose() {
        gameState.setGameOver(Boolean.TRUE);
        userInteraction.showGameOverLoseMessage();
    }
    public void scenarioWin() {
        gameState.setGameOver(Boolean.TRUE);
        userInteraction.showGameOverWinMessage();
    }
}
