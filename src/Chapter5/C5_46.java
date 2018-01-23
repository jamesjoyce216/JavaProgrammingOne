package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string.
 *
 * @author James Joyce
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter String
        System.out.print("Enter your string: ");
        String s = input.nextLine();

        //Reverse String
        System.out.println("\nYour String reversed is: "
                + (new StringBuffer(s).reverse().toString()));

    }
}
