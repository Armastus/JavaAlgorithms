package Binaries;

import java.util.Scanner;

public class findBinaryWithFactorial {

    static int binFact(int n) {
        if (n <= 0) {
            return 0;
        } else {
            int remainder = n % 2;
            binFact(n / 2);
            return remainder;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        int n = in.nextInt();
        int n = 34;
        int result = binFact(n);
        System.out.println(result);
    }
}
