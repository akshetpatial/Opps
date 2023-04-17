package com.akshet.Game;

import java.util.Random;
import java.util.Scanner;


public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("##################################################  Welcome to the Game Guess the Number  ###############################################\n");

        int count = 0;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t    Guess any number between 1 and 1000!");
        GuessGame g = new GuessGame();

        System.out.println("\t\t\t\t\t We already have a number with us lets see HOW FAST you guess it correct and after HOW MANY tries. GOOD LUCK!");

        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b =g.isCorrectNum();
            count++;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  you guessed the number after " + count + " try/tries!");
        if (count > 10) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t    You Require More Practise ");
            System.out.println("##################################################  Thank you for playing the game   #############################################");

        } else if (count < 5) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t     You Played Really Nice ");
            System.out.println("##################################################  Thank you for playing the game  #############################################");

        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t      Keep up the good work ");
            System.out.println("##################################################  Thank you for playing the game  #############################################");

        }
    }
}
