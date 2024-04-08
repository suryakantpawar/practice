/**
 * Factorial: Calculate the factorial of a non-negative integer n.
 */
public class Factorial {
    public static void main(String[] args) {

        int n = 6;
        System.out.println("Factorial of " + n + " is " + factorialCalculator(n));

    }

    private static int factorialCalculator(int n) {

        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }

        return fact;
    }
}
