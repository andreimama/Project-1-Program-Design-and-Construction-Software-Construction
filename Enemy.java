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
  public String mobName = "";
  public int healthPoints;
  public int damage;

  public Enemy(String name, int healthPoints )
  {
    this.mobName = name;
    this.healthPoints = healthPoints;
    
  }  
  
  public void setName(String newName) {
        this.mobName = newName;
    }
  

public abstract int dealsDamage();

public abstract int takesDamage(int damage);
   
}

