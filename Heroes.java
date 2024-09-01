/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author franc
 */
//interface class
public interface Heroes {
    void takesDamage(int amount);
    void powerUp(int amount);
    void addHealth(Boolean thing, int amount);
    void setHealth(int health);
    void setDealDamage(int damage);
    int getDealDamage();
    int getHealth();
    String getName();
    
}
