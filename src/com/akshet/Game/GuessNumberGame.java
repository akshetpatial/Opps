package com.akshet.Game;

import java.util.Random;
import java.util.Scanner;

// If we make it public then  it should be defined inside the class GuessGame.java but the class name for this class is
// GuessNumberGame.java if we want to outside then do not use public.
class GuessGame
{
    int CPU_num;
    int Your_num;
    // Creating a constructor
    public GuessGame()
    {
        Random ran= new Random();
        CPU_num=ran.nextInt(1000)+1;
    }
    public void takeUserInput()
    {
        Scanner scan = new Scanner(System.in);
        try {
            Your_num= scan.nextInt();
            if(Your_num>1000){
                System.out.println("Sorry the number can only be between 1 and 1000!");
                System.exit(0);
            }
        }catch (Exception e){
            System.out.println("Please Enter Number Between 1 and 1000 Only!...");
        }
    }
    public  boolean isCorrectNum()
    {
        if(Your_num==CPU_num)
        {
            System.out.println("you have guessed it right!");
            return true;
        }
        else if(Your_num<CPU_num)
        {
            if((((float)Your_num/CPU_num)*100)>=90){
                System.out.println("Your Number is Low but You are Very Close, Give it an other try!: ");
                System.out.println("Guess the Number Again! ");

            }else if((((float)Your_num/CPU_num)*100)>=20 && ((Your_num/CPU_num)*100)<90) {
                System.out.println("Your Number is Low!: ");
                System.out.println("Guess the Number Again! ");
            }else if((((float)Your_num/CPU_num)*100)<20){
                System.out.println("Your Number is Too Low!: ");
                System.out.println("Guess the Number Again! ");
            }
            else {
                System.out.println("Guess the Number Again! ");
            }
        }
        else
        {
            if((((float)CPU_num/Your_num)*100)>=90){
                System.out.println("Your Number is High but You are Very Close, Give it an other try!: ");
                System.out.println("Guess the Number Again! ");

            }else if((((float)CPU_num/Your_num)*100)> 50 && ((CPU_num/Your_num)*100)<90){
                System.out.println("Your Number is High!: ");
                System.out.println("Guess the Number Again! ");
            }
            else if((((float)CPU_num/Your_num)*100)<=50){
                System.out.println("Your Number is Too High!: ");
                System.out.println("Guess the Number Again! ");
            }
            else {
                System.out.println("Guess the Number Again! ");
            }
        }
        return false;
    }
}

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
