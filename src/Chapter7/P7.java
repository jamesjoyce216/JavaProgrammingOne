package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to read the contents of the array.
 *
 * @author jj1002687
 */
public class P7 {
    /**
     * main Method
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //how many numbers to be read
        System.out.println("How many numbers will be read?: ");
        
        int [] yourFace = new int [input.nextInt()];
        randomVariable(yourFace, input);
         
        System.out.println("\nThe Average is " + average(yourFace));
         
        System.out.println("\nThe contents of the array: \n");
        printing(yourFace);
    }
    
    /**
     * randomVariable Method
     * @param someVar
     * @param input 
     */
    //ask for number of elements in new method 
    public static void randomVariable(int []someVar, Scanner input )
    {
        System.out.println("\nEnter "+someVar.length+ " elements: ");
        
        //loop that will allow you to put the values entered into the array
        for(int anInt = 0; anInt < someVar.length; anInt++)
        {
            someVar[anInt] = input.nextInt();
        }
    }
    
    /**
     * average double method
     * 
     * @param averageVar
     * @return finalAverage
     */
    //find average in new method
    public static double average(int []averageVar) 
    {
        double add = 0;
        for(int avInt = 0; avInt < averageVar.length; avInt++)
        {
            add = add + averageVar[avInt];
        }
        double finalAverage = add / averageVar.length;
        return finalAverage;
    }
    
    /**
     * printing Method
     * 
     * @param manyVars 
     */
    public static void printing(int [] manyVars)
    {
        System.out.println(Arrays.toString(manyVars));
    }
}