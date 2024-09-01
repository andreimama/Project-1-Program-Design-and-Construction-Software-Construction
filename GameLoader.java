/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author franc
 */

public class GameLoader {
    private Saving loader;

    public GameLoader(Saving loader) {
        this.loader = loader;
    }

    public int loadGameState(Heroes main, Heroes medic, Heroes stealth, Heroes tank) {
        LinkedList<String> lastLines = new LinkedList<>(); //Linked list used to ensure only the last 9 lines are read to load the old game

        try (BufferedReader reader = new BufferedReader(new FileReader("GameSaving"))) {
            String line;

            // Read the entire text file and store only the last 9 lines
            while ((line = reader.readLine()) != null) {
                if (lastLines.size() == 9) {
                    lastLines.poll();
                }
                lastLines.add(line);
            }

            // Once we have the last 9 lines, parse them to set up the game state
            if (lastLines.size() == 9) {
                int lastDesc = Integer.parseInt(lastLines.get(0));
                String mainName = lastLines.get(1);
                int mainDamage = Integer.parseInt(lastLines.get(2));
                int mainHealth = Integer.parseInt(lastLines.get(3));
                int stealthDamage = Integer.parseInt(lastLines.get(4));
                int stealthHealth = Integer.parseInt(lastLines.get(5));
                int medicHealth = Integer.parseInt(lastLines.get(6));
                int tankDamage = Integer.parseInt(lastLines.get(7));
                int tankHealth = Integer.parseInt(lastLines.get(8));

                // Load each character
                ((mainDude) main).setName(mainName);
                main.setDealDamage(mainDamage);
                main.setHealth(mainHealth);
                stealth.setDealDamage(stealthDamage);
                stealth.setHealth(stealthHealth);
                medic.setHealth(medicHealth);
                tank.setDealDamage(tankDamage);
                tank.setHealth(tankHealth);

                return lastDesc;  // Return the last descision for resuming the game
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading game: " + e.getMessage());
        }

        return -1;  // Return -1 if loading fails
    }
} 
