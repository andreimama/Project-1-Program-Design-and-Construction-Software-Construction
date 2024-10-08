/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author franc
 */
public class Tank implements Heroes{
    private String name;
    private int dealDamage;
    private int health;
    
    public Tank(){
        this.name = "Angelo";
        this.dealDamage = 40;
        this.health = 150;
    }
    //Takes damage from enemy
    @Override
    public void takesDamage(int amount){
        this.health = this.getHealth() - amount;
    }
    //Adds to the damage a hero can deal
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
    public void setHealth(int Health) {
        this.health = Health;
    }
    
    @Override
    public void setDealDamage(int damage) {
        this.dealDamage = damage;
    }
   
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDealDamage() {
        return dealDamage;
    }
    
    
    @Override
    public int getHealth() {
        return health;
    }
    
    
}
