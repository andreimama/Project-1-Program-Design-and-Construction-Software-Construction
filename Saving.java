/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justanothertuesday;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author franc
 */


public class Saving {

    public String readSave() {
        StringBuilder returnStr = new StringBuilder();

        try {
            String line;
            BufferedReader inStream = new BufferedReader(new FileReader("GameSaving"));
            while ((line = inStream.readLine()) != null) {
                returnStr.append(line).append("\n");
            }
            inStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file.");
        } catch (IOException e) {
            System.out.println("File could not be read");
        }

        return returnStr.toString();
    }
    
    //Method to write heroes' stats
    public void writeSave(int prog) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("GameSaving", true))) { 
            pw.println(prog); //Important for the data to be saved on a new line each time
        } catch (IOException e) {
            System.out.println("Could not write to the file.");
        }
    }
    
    //Used to save main character's name
    public void writeSave(String prog) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("GameSaving", true))) {
            pw.println(prog);  //Important for the data to be saved on a new line each time
        } catch (IOException e) {
            System.out.println("Could not write to the file.");
        }
    }
}
