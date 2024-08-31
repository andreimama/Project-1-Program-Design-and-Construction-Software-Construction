/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mamar
 */
public class Game {
    
    private GameState gameState;
    private UserInteraction userInteraction;
    private Scenarios scenarios;
    private InputHandler inputHandler;
    private GameLoader gameLoader;
    
    
    public Game() {
        this.gameState = new GameState();
        this.userInteraction = new UserInteraction();
        this.scenarios = new Scenarios(userInteraction, gameState);
        this.inputHandler = new InputHandler();
        this.gameLoader = new GameLoader(new Saving());
    }
    public void start()
    {
        // this is just to print WELCOME TO JUST ANOTHER TUESDAY 
        userInteraction.showWelcomeMessage();
        
        //asks for input and checks that input is an integer and is in between parameters 1 and 2
        int choice = inputHandler.getInt("Would you like start a new game(1) or load a saved game(2)", 1, 2);
                if (choice == 1) {
                    gameState.setDesc(1);
                } else if (choice == 2) {
                //    gameLoader.loadGameState(scenarios.getMain(), medic, stealth, tank);
                 }
                
                runGameLoop();
    }
                
    //method to run game loop
    private void runGameLoop() {
        /*while (true) makes it so that it checks whenever desc changes and proceeds
        to next scenario*/
        while (true) {
            switch (gameState.getDesc()) {
                case 1:
                    scenarios.scenarioOne();
                    break;
                case 2:
                    scenarios.scenarioTwo();
                    break;
                case 3:   
                    scenarios.scenarioThree();
                    break;
                case 4:
                    scenarios.scenarioFour();
                    break;
                case 5:
                    scenarios.scenarioWin();
                case -1:
                    scenarios.scenarioLose();
                    break;
                
            }
        }
    }
    
}
    
