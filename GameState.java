/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

/**
 *
 * @author mamar
 */

//Chatgpt was used here, just to seperate from the main game logic in scenarios. To track game progress aswell.
public class GameState {
    //flag that checks if game has ended
    private boolean gameOver;
    
    //highlights which part the player is in
    private int desc;

    //sets inital instance of GameState with gameover to false and desc to 0
    public GameState() {
        this.gameOver = false;
        this.desc = 0;
    }
    
    //returns value to see if game has ended
    public boolean isGameOver() {
        return gameOver;
    }

    //updates if game is over (other parts of the progam will use this)
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    
    //see what state the game/player is at  
    public int getDesc() {
        return desc;
    }
   
    //this will update desc to move through scenarios.
    public void setDesc(int desc) {
        this.desc = desc;
    }
}
