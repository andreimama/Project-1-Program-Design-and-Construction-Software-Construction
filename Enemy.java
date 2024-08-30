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
  private String mobName = "";
  private int healthPoints;
  private int damage = 30;

  public Enemy(String name, int healthPoints )
  {
    this.mobName = name;
    this.healthPoints = healthPoints;
    
  }  
  //set name of 
  public void setName(String newName) {
        this.mobName = newName;
    }
  public String getName() {
      return this.mobName;
  }
  
  public void setHealth(int hp) {
        this.healthPoints = hp;
    }
  public int getHealth() {
      return this.healthPoints;
  }
  
  public void setDamage(int damage) {
      this.damage = damage;
  }
  
  public int getDamage() {
      return this.damage;
  }
  
//abstract methods that are implemented by SubBoss class
public abstract int dealsDamage();

public abstract int takesDamage(int damage);
   
}

