package Recursion;

public class RecursionGOODLUCK {

    // Example 1
    // Problem: Get Summation of 3 (ie: 3 + 2 + 1)
    private static int Summation(int n) {
        // Base Case: WE ARE AT THE END
        if (n <= 0) {
            return 0;
            // Recursive Case
        } else {
            // 3 + Summation(3 - 1)
            // 2 + Summation(2 - 1)
            // 1 + Summation(1 - 1)
            // n now is 0. Recursion stops!
            return n + Summation(n - 1);
        }
    }

    // Example 2
    // Problem: Get Factorial 5! (ie: 5 * 4 * 3 * 2 * 1)
    private static int Factorial(int n) {
        // Base Case:
        if (n <= 1) {
            return 1;
            // Recursive Case:
        } else {
            // 5 * Factorial(5 - 1)
            // 4 * Factorial(4 - 1)
            // 3 * Factorial(3 - 1)
            // 2 * Factorial(2 - 1)
            // 1 * Factorial(1 - 1)
            // n is now 1. Recursion stops!
            return n * Factorial(n - 1);
        }
    }

    // Example 3
    // Problem: Get Exponentiation 5^3 (ie: 5 * 5 * 5)
    private static int Exponentiation(int n, int p) {
        // Base Case:
        if (p <= 0) {
            return 1;
            // Recursive Case:
        } else {
            // 5 * Exponentiation(5, 3 - 1)
            // 5 * Exponentiation(5, 2 - 1)
            // 5 * Exponentiation(5, 1 - 1)
            // p is now 0. Recursion stops!
            return n * Exponentiation(n, p - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(5));
        System.out.println(Exponentiation(5, 3));
    }
}
