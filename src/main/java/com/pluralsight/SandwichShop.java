package com.pluralsight;
import java.util.*;

public class SandwichShop {

    public static void main(String[] args) {

        //Assigning a Scanner to the method

        Scanner scanner = new Scanner(System.in);

        //Declaring Variables to choose from 1 to 2 with the explanation of what 1 and 2 are

        System.out.println("Choose 1 or 2 \n1: Regular: base price $5.45 \n2: Large: base price $8.95");
        String baseNum = scanner.nextLine();

        // For Loaded Sandwich Yes or No input
        System.out.println("Would you like the sandwich loaded? yes/no");
        String loadedSw = scanner.nextLine();

        // If statement to ask the user what Yes and No to loaded Sandwich does
        if (loadedSw.equalsIgnoreCase(("yes"))) {
            System.out.println("There is an additional cost of loaded sandwich \nRegular $1.00 \nLarge $1.75");
        }
        else if (loadedSw.equalsIgnoreCase(("no"))) {
        }


        // Declaring Age. After the loaded If statement, so it runs second
        System.out.print("\nAge= ");
        float age = scanner.nextFloat();
        scanner.nextLine();

        // Main operation to
        if (baseNum.equals("1")) {
            if (age <= 17) {
                // Asking about loaded Sandwich, if yes, it will add 1 to the initial value since its Regular
                if (loadedSw.equalsIgnoreCase(("yes"))){
                System.out.printf("Price = $%.2f", (1+ 5.45f - (0.1f * 5.45f)));
                } else {
                    // If no, it will remain the calculation of $5.45 - (10% of $5.45) which gives 10% discount
                    System.out.printf("Price = $%.2f", (5.45f - (0.1f * 5.45f)));
                }
            } else if (age >= 65) {
                // Asking about loaded Sandwich, if yes, it will add 1 to the initial value since its Regular
                if (loadedSw.equalsIgnoreCase(("yes"))){
                System.out.printf("Price = $%.2f", (1 + 5.45f - (0.2f * 5.45f)));
                } else {
                    // If no, it will remain the calculation of $5.45 - (20% of $5.45) which gives 10% discount
                    System.out.printf("Price = $%.2f", (5.45f - (0.2f * 5.45f)));
                }
            } else {
                // Asking about loaded Sandwich, if yes, it will add 1 to the initial value since its Regular
                if (loadedSw.equalsIgnoreCase(("yes"))){
                System.out.printf("Price = $%.2f", (1 + 5.45f));
                } else {
                    // If no, it will remain the base price of $5.45
                    System.out.printf("Price = $%.2f", (5.45f));
                }
            }
        }

        else if (baseNum.equals("2")) {
            if (age <= 17) {
                // Asking about loaded Sandwich, if yes, it will add 1.75 to the initial value since its Large
                if (loadedSw.equalsIgnoreCase(("yes"))){
                System.out.printf("Price = $%.2f", (1.75f + 8.95f - (0.1f * 8.95f)));
                } else {
                    // If no, it will remain the calculation of $8.95 - (10% of $8.95) which gives 10% discount
                    System.out.printf("Price = $%.2f", (8.95f - (0.1f * 8.95f)));
                }
            }
            else if (age >= 65) {
                // Asking about loaded Sandwich, if yes, it will add 1.75 to the initial value since its Large
                if (loadedSw.equalsIgnoreCase(("yes"))){
                System.out.printf("Price = $%.2f",  (1.75f + 8.95f - (0.2f * 8.95f)));
                } else {
                    // If no, it will remain the calculation of $8.95 - (20% of $8.95) which gives 20% discount
                    System.out.printf("Price = $%.2f",  (8.95f - (0.2f * 8.95f)));
                }
            }
            else {
                // Asking about loaded Sandwich, if yes, it will add 1.75 to the initial value since its Large
                if (loadedSw.equalsIgnoreCase(("yes"))){
                System.out.printf("Price = $%.2f", (1.75f + 8.95f));
                } else {
                    // If no, it will remain the base price of $8.95
                    System.out.printf("Price = $%.2f", (8.95f));
                }
            }
        }
        else {
            // Prompts to choose again if it is not 1 or 2
            System.out.println("Please choose between 1: Regular or 2: Large");
        }
    }
}
