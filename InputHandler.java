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

//Class handles input and checks for errors
public class InputHandler {
    
    //Declaration of scanner object
    private Scanner scanner;
    
    //Initialise scanner object - constructor
    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }
    
    //method that finds an integer and validate integer input
    public int getInt(String message, int min, int max) {
        
        //variable for user input
        int input;
        
        //This will loop until valid input
        //Slight Chatgpt used to check if input is correct according to the parms.
        while (true) {
            System.out.println(message);
            try {
                if (scanner.hasNextInt()) {
                    //reads integer output
                    input = scanner.nextInt();
                    if (input >= min && input <= max) {
                        break;
                    } else {
                        System.out.println("Please enter a valid integer between " + min + " and " + max + ":");
                    }
                } else {
                    System.out.println("Please enter a valid integer: ");
                    scanner.next(); //if it scans not an integer, it discards that input and prompts user.
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer: ");
                scanner.next(); //if it scans not an integer, it discards that input and prompts user.
            }
        }
        return input;
    }
    //method that finds and validates string input
    public String getStringInput() {
        String hold;
        while (true) {
            hold = scanner.nextLine().trim();
            //checks if alphabetical characters only
            if (hold.matches("[a-zA-Z ]+")) {
            break;
            } else {
            System.out.println("Please enter a valid name: (Alphabetic Characters Only): ");
            }   
                 
            } return hold;
    }   
}
    
            
            

