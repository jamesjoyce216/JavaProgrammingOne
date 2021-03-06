package Chapter3;

import java.util.Scanner;

/**
 * Program that prompts the user to enter an integer and determines whether it
 * is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is
 * divisible by 5 or 6, but not both.
 *
 * @author James Joyce
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Recieve integer
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 and 6? True");
        } else {
            System.out.println("Is " + number + " divisible by 5 and 6? False");
        }

        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6? True");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6? False");
        }

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? True");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? False");
        }
    }
}
