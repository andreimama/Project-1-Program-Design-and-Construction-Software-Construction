/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author mamar
 */

    public abstract class Enemy
{
  //encapsulation of private fields
  private String mobName = "";
  private int healthPoints;
  private int damage = 30;

  //constructor that intialise name and hp
  public Enemy(String name, int healthPoints )
  {
    this.mobName = name;
    this.healthPoints = healthPoints;
    
  }  
  //set names of enemy
  public void setName(String newName) {
        this.mobName = newName;
    }
  //get name of enemy
  public String getName() {
      return this.mobName;
  }
  
  //method sets health of enemy
  public void setHealth(int hp) {
        this.healthPoints = hp;
    }
  
  //method to gets health of eney
  public int getHealth() {
      return this.healthPoints;
  }
  
  
  //sets damage of Enemys
  public void setDamage(int damage) {
      this.damage = damage;
  }
  //method to get damage of enemy
  public int getDamage() {
      return this.damage;
  }
  
//abstract methods that are implemented by SubBoss class
  //proof of polymorphism
public abstract int dealsDamage();

public abstract int takesDamage(int damage);
   
}

