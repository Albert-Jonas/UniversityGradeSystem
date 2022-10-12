public class PiComputing {
    public static void main (String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000000;   // Try 10000, 100000, 1000000
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
            if (denominator % 4 == 1) {
                sum += 1/ ((double) denominator);
            } else if (denominator % 4 == 3) {
                sum -= 1/ ((double) denominator);
            } else {   // remainder of 0 or 2
                System.out.println("Impossible!!!");
            }
        }
        double approximation = 4 * sum;
        System.out.println("A Pi közelítésünk MAX_DENOMINATOR " + MAX_DENOMINATOR + "-ral: " + approximation);
    }
}



