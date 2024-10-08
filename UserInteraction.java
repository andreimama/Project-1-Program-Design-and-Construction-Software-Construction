/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author mamar
 */

//this class wlil deal with printing to the user. Implements userinterface
//dealing with inputs from user is in UserInteraction which implements UserInterface
public class UserInteraction implements UserInterface{
    
    @Override
    public void showWelcomeMessage() {
        System.out.println("WELCOME TO JUST ANOTHER TUESDAY!\n");
    }
    
    @Override
    public void showGameOverLoseMessage() {
        System.out.println("\n\n\n You have lost, Game Over.");
        System.out.println("Humanity laments your loss.");
        System.exit(0);
    }
    
    @Override
    public void showGameOverWinMessage() {
        System.out.println("\n\n\n You have beaten the worm and close down the portal and Saved Humanity, Game Over.");
        System.out.println("Humanity celebrates your win!");
        System.out.println("\"Its Just another Tuesday.\"");
        System.exit(0);
    }
    
    @Override
    public void showMessagePlusDelay(String message, int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(message);
    }
    //Print statement of Scenario1 depending on choice
    public String getScenario1Case1() {
        return "\nYou shoot the monster and it drops to the floor.\nYou check and the gun still has 2 bullets left";
    }
    
    public String getScenario1Case2() {
        return "\nYou go to hide behind the mysterious person\nLuckily the stranger handles the beast...\nBut got injured in doing so...";
    }
    
    //Print statement of Scenario2 depending on choice
    public String getScenario2Case1() {
        return "\nYou go through the backdoor, You see a person covered in black.\nYou catch him off guard and secretly gain his respect.";
    }
    
    public String getScenario2Case2() {
        return "\nYou go through the front door and you trigger a spike trap and get hurt, but you see your final member.\n" + "Texan Voice: Sorry 'bout the traps y'all, cant have aliens moseyin' on in here.";
    }
    
    //Print statement of aftermath of choosing an attacking option in scenario
    public String getPrintAttack(String name, int damage, int healthpoints, String targetname) {
        return "\n" + name + " performs an attack! It deals " + damage + "dmg" +"\nHealth of " + targetname + ": " + healthpoints;
        

    }
    
    //Print statement of Scenario3 depending on choice
    public String getScenario3Case3(String name) {
        return "\n" + name + " steps on a branch, and the alien is alerted of your presence!";
        
    }
    
    public String getScenario4Case3(String name, String name2, int health) {
        return "\n" + name + " heals " +name2 +" for 20HP" + "\n Health of " + name2 + ": " + health;
    }
    
}

 
