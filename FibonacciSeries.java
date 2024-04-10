/**
 * Print Fibonacci Series.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        nthFibonacci(5);
        nthFibonacci(20);
    }

    static void nthFibonacci(int n) {
        int sum, t1 = 0, t2 = 1;
        for (int i = 3; i <= n; i++) {
            sum = t1 + t2;
            System.out.print(sum + " ");
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }
}
