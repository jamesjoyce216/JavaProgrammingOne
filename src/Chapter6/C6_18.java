package Chapter6;

import java.util.Scanner;

/**
 * Program to create proper password
 *
 * @author James Joyce
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter Password
        System.out.println("Enter new password: ");
        String password = input.nextLine();

        if (isValid(password)) {
            System.out.print("valid password ");
        } else {
            System.out.print("invalid password ");
        }

    }

    //If Password is Valid
    public static boolean isValid(String p) {
        int counter = 0;

        //8 characters
        if (p.length() < 8) {
            return false;
        }

        //consists of digits & numbers
        for (int i = 0; i < p.length(); i++) {
            if (!Character.isLetterOrDigit(p.charAt(i))) {
                return false;
            }
        }

        {
            for (int i = 0; i < p.length(); i++) {
                if (Character.isDigit(p.charAt(i))) {
                    ++counter;
                }
            }
        }

        if (counter < 2) {
            return false;
        }

        return true;
    }

}
