/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

import java.util.Random;

/**
 *
 * @author franc
 */

//implements the Heroes interface and inherits the methods. - inheritance
public class Stealth implements Heroes {
    //private fields with public getters and setters.
    private String name ;
    private int health;
    private int dealDamage;
    
    //Constructor initalizing the fields.
    public Stealth(){
        this.name = "Sir Sneaksalot";
        this.health = 100;
        this.dealDamage = 30;
    }
    
    //Polymorphism - Overriding methods from heroes interface.
    @Override
    public void takesDamage(int amount){
        this.health = this.getHealth() - amount;
    }
    @Override
    public void powerUp(int amount){
        this.dealDamage = this.getDealDamage() + amount;
    }
    
    @Override
    public void addHealth(Boolean thing, int amount){
        if(thing){
            this.health += amount;
        }
    }
    @Override
    public void setDealDamage(int damage) {
        this.dealDamage = damage;
    }
    
    @Override
    public int getDealDamage() {
        return dealDamage;
    }
    
    @Override
    public void setHealth(int Health) {
        this.health = Health;
    }
    
    @Override
    public String getName() {
        return name;
    }
    //Calculates if attack will be critical or not
    public int criticalHit(){
        Random rand = new Random();
        int chance = rand.nextInt(20);
        //40% chance to deal a bonus 15 dmg
        if(chance<8){
            
            return this.dealDamage += 15;
        }
        return this.dealDamage;
        
    } 

    //gets and returns health
    public int getHealth() {
        return health;
    }

    
} 
