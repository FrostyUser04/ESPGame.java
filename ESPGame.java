/*
 * Class: CMSC203 
 * Instructor: Prof. Tanveer
 * Description: The program below is designed to allow users to play around with 7 different colors and just guess them
 * Due: 02/13/2024
 * Platform/compiler: VS Code
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: _____Yesho Vir_____
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame {   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       
        //Color Constants
        final String COLOR_RED = "Red";
        final String COLOR_GREEN = "Green";
        final String COLOR_BlUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";
        final String COLOR_PURPLE = "Purple";
        final String COLOR_WHITE = "White";

        //Intro
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
       
        System.out.print("Due Date: ");
        String duedate = scanner.nextLine();
       
        System.out.print("CMSC203 Assignment1: Test your ESP skills!\n");

        //ESP Game Begins
        int score = 0;

        for (int i = 1; i<=11; i++) {

            System.out.println("\nRound " + i);
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Purple, or White?");
            System.out.println("Enter your guess: ");
            String studentInput = scanner.nextLine();

            int randomNumber = random.nextInt(7);

            String randomColor = "";

            switch (randomNumber) {

                case 0: 
                randomColor = COLOR_RED;
                break;

                case 1:
                randomColor = COLOR_GREEN;
                break;

                case 2:
                randomColor = COLOR_BlUE;
                break;

                case 3:
                randomColor = COLOR_ORANGE;
                break;

                case 4:
                randomColor = COLOR_YELLOW;
                break;

                case 5:
                randomColor = COLOR_PURPLE;
                break;

                case 6:
                randomColor = COLOR_WHITE;
                break;

            }
            
            if (studentInput.equalsIgnoreCase(randomColor)) {
                System.out.println("I was thinking of " + randomColor);
                score++;

            } else {
                System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Purple, White?");
                System.out.println("Enter your guess again: ");
                studentInput = scanner.nextLine();
            
            }

            System.out.println("\nI was thinking of " + randomColor);

        }

        //Outro
        System.out.println("\nGame Over\n");
        System.out.println("You guessed " + score + " out of 11 colors correctly.");
        System.out.println("Student name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date " + duedate);

        scanner.close();

    }

}