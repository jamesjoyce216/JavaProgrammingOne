package Chapter8;

/**
 * Program to show employee schedule
 *
 * @author James Joyce
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int total = 0;

        int[][] hours
                = {
                    {2, 4, 3, 4, 5, 8, 8},
                    {7, 3, 4, 3, 3, 4, 4},
                    {3, 3, 4, 3, 3, 2, 2},
                    {9, 3, 4, 7, 3, 4, 1},
                    {3, 5, 4, 3, 6, 3, 8},
                    {3, 4, 4, 6, 3, 4, 4},
                    {3, 7, 4, 8, 3, 8, 4},
                    {6, 3, 5, 9, 2, 7, 9},};

        int[] totals = new int[8];
        System.out.println();
        System.out.println("\t \tSu\tM\tT\tW\tTh\tF\tSa\tTotal");

        while (a < 8) {
            System.out.print("Employee" + a + "     \t");

            while (b < 7) {
                System.out.print(hours[c][b] + "   \t");
                b++;
            }

            for (int x = 0; x < 7; x++) {
                total += hours[a][x];
            }

            System.out.print(total);
            totals[a] = total;
            total = 0;
            System.out.println();
            b = 0;
            c++;
            a++;
        }
    }
}
