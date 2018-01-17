package Chapter5;

import java.util.Scanner;

/**
 * Program to tally votes
 *
 * @author James Joyce
 */
public class P5 {

    private static char v;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //set variables
        int Yes = 0;
        int No = 0;
        //set loop
        do {
            System.out.print("Enter your vote: ");
            String vote = input.nextLine().toUpperCase();

            char v = vote.charAt(0);

            if (v != ('Y') || v != ('N')) {
                switch (v) {
                    case 'Y':
                        ++Yes;
                        break;
                    case 'N':
                        ++No;
                        break;
                    case 'Q':
                        System.out.printf("Yes votes = %d \nNo votes = %d\n", Yes, No);
                        System.exit(0);
                        break;
                    default:
                        System.out.println("INVALID INPUT \n Enter 'Y' to vote yes \n Enter 'N' to vote no \n Enter 'Q' to end vote");
                        break;
                }
            }
        } while (v != 'Q');
    }
}
