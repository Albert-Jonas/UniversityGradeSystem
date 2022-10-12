/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
    public static void main (String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final float LOWERBOUND = 1;
        final float UPPERBOUND = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (float number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;     // same as "sum = sum + number"
        }
        average = sum/(UPPERBOUND-LOWERBOUND+1);
        // Compute average in double. Beware that int / int produces int!
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        // Print sum and average
        System.out.println("The average is " + average);
    }
}