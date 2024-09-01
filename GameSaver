/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author franc
 */

//GameSaver creates an instance of Saving.
public class GameSaver {
    private Saving saver;

    public GameSaver(Saving saver) {
        this.saver = saver;
    }
//SavegameState method uses writeSave methods from Saving Class
//To save details of the other classes
    public void saveGameState(int desc, Heroes main, Heroes medic, Heroes stealth, Heroes tank) {
        saver.writeSave(desc);
        saver.writeSave(main.getName());
        saver.writeSave(main.getDealDamage());
        saver.writeSave(main.getHealth());
        saver.writeSave(stealth.getDealDamage());
        saver.writeSave(stealth.getHealth());
        saver.writeSave(medic.getHealth());
        saver.writeSave(tank.getDealDamage());
        saver.writeSave(tank.getHealth());
    }
}
