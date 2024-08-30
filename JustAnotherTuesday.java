/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.justanothertuesday;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mamar
 */
public class JustAnotherTuesday {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Game game = new Game(scan, new GameSaver(new Saving()));
    game.start();
    }

}
