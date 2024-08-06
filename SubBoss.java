/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdc.project1;
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
    
    public void setHealthPoints(int healthPoints)
    {
        this.healthPoints = healthPoints;
    }


    @Override
    public int dealsDamage() 
    {
        Random rand = new Random();
    int rand_int1 = rand.nextInt(20);
    if (rand_int1 < 9) 
      {
        return this.damage =  50;
      }
    else 
      {
         return this.damage = 0;
      }
    }
    
    @Override
    public int takesDamage(int damage)
    {
        this.healthPoints -= damage;
        return this.healthPoints;
        
    }

 }


