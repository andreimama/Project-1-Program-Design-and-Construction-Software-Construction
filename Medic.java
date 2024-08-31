/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author franc
 */

//Medic class implements the Heroes interface - inheritance
public class Medic implements Heroes{
    //encapsulation, private fields with public getters and setters.
    private String name;
    private int health;
    private int dealDamage;

    //constructor initalizing the fields
    public Medic() {
        this.name = "Charity";
        this.health = 100;
        this.dealDamage = 20;
    }
    
   
    
    //polymorphsim, overriding methods in heroes interface
    @Override
    public void takesDamage(int amount){
        health -= amount;
    }
    @Override
    public void powerUp(int amount){
        dealDamage+=amount;
    }
    @Override
    public void addHealth(Boolean thing,int amount){
        this.health += amount;
    }
     @Override
    public void setHealth(int Health) {
        this.health = Health;
    }
    
    //sets deal damage -used for saving
    @Override
    public void setDealDamage(int damage) {
        this.dealDamage = damage;
    }
    
    @Override
    public String getName() {
        return name;
    }

     //returns damgae
    @Override
    public int getDealDamage() {
        return dealDamage;
    }
    
    //adds health to any hero
    public void heal(Heroes hero,int amount){
        hero.addHealth(true,amount);
    }
    
    
    
    //gets health
    public int getHealth() {
        return health;
    }

   
    
    
}
