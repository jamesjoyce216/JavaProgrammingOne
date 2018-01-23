package Chapter7;

import java.util.Scanner;

/**
 * Program to find the minimum of ten numbers.
 *
 * @author James Joyce
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input numbers
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int n = 0; n < 10; ++n) {
            numbers[n] = input.nextDouble();
        }

        //tell the user what the smallest number in the array is
        System.out.println("The minimum number is: " + min(numbers));
    }

    /**
     * min Method
     *
     * @param array the array is an array
     * @return least
     */
    // find the smallest value in the array
    public static double min(double[] array) {
        double least = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] < least) {
                least = array[i];
            }
        }
        return least;
    }
}
