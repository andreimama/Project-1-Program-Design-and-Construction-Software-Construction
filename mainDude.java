/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author mamar
 */
public class mainDude implements Heroes {
    private String name = "";
    private int health;
    private int dealDamage;
   // private int weapon;
   // private boolean armed = false;
    
    //constructor that initalizes mainDude with a name
    public mainDude(String name,int dealDamage){
        this.name = name;
        this.health = health =100;
        this.dealDamage=dealDamage;
        //this.weapon = weapon = 0;
    }
    @Override
    public void takesDamage(int amount){
        this.health = getHealth() -amount;
    }
    
    @Override
    public void powerUp(int amount){
        this.dealDamage = getDealDamage() + amount;
    }
  
    //adds health of mainDude
    @Override
    public void addHealth(Boolean thing, int amount){
        if(thing){
            this.health += amount;
        }
    }
    
    //sets the health of mainDude for loading
    @Override
    public void setHealth(int Health) {
        this.health = Health;
    }
    
    @Override
    public void setDealDamage(int damage) {
        this.dealDamage = damage;
    }

    //returns name
    @Override
    public String getName() {
        return name;
    }

    //sets name
    
    public void setName(String name) {
        this.name = name;
    }

    //returns the health
    @Override
    public int getHealth() {
        return health;
    }

    //returns damage
    @Override
    public int getDealDamage() {
        return dealDamage;
    }
    
    
}
