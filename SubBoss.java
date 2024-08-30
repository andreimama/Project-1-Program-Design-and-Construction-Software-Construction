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
public class SubBoss extends Enemy
{
      public SubBoss(String name, int healthPoints) 
    {
        super(name, healthPoints);
    }


    @Override
    public int dealsDamage() {
        return super.getDamage();
    } 
    
    
    
    @Override
    public int takesDamage(int damage)
    {
        this.setHealth(this.getHealth() - damage);
        return this.getHealth();
     //this.healthPoints -=damage;
     //return this.healthPoints
    }

 }
