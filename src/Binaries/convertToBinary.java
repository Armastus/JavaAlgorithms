package Binaries;

import java.util.Stack;

public class convertToBinary {

    public static void findBinary(int n) {
        Stack st = new Stack();
        int b = 2;
        Object blah = 0;
        while (n > 0) {
            st.push(n % b);
            n = n / b;
        }
        // Reverse the binary for correct answer.
        for(int ii = st.size(); ii >= 1; ii--) {
            System.out.print(st.pop());
        }
    }

    public static int totalBinOne(int n) {
        int remainder;
        int consecutiveOne = 0;
        int totalOne = 0;

        while(n > 0)
        {
            remainder = n % 2;
            n = n / 2;
            if (remainder == 1) {
                consecutiveOne++;
                if (consecutiveOne >= totalOne) {
                    totalOne = consecutiveOne;
                }
            }
            else {
                consecutiveOne = 0;
            }
        }
        return totalOne;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 439;
        System.out.println(totalBinOne(n));
        findBinary(n);

    }
}
