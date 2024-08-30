/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

import java.util.Random;

/**
 *
 * @author mamar
 */
//subclass of Enemy, this is inheritance
public class SubBoss extends Enemy
{
    //Constructor for subboss
      public SubBoss(String name, int healthPoints) 
    {
        super(name, healthPoints);
    }

      //deals get Damage, just returns for SubBoss, can be different for Boss class if added
    @Override
    public int dealsDamage() {
        return getDamage();
    } 
    
    
    //Method to decrease health by damage amount
    @Override
    public int takesDamage(int damage)
    {
        this.setHealth(this.getHealth() - damage);
        return this.getHealth();
     //this.healthPoints -=damage;
     //return this.healthPoints
    }

 }
