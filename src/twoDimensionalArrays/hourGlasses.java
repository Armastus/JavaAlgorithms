package twoDimensionalArrays;
/**     Context:
        Given a 6 x 6 2D Array, A:

        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 0 0 0 0
        0 0 0 0 0 0
        0 0 0 0 0 0

        We define an hourglass in A to be a subset of values with indices falling in this
        pattern in A's graphical representation:

        a b c
          d
        e f g

        There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

        Task:
        Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

        Input Format:
        There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A;
        every value in A will be in the inclusive range of -9 to 9.

        Constraints:
        * -9 <= A[i][j] <= 9
        * 0 <= i,j <= 5

        Output Format:
        Print the largest (maximum) hourglass sum found in A.

        Sample Input:
        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0

        Sample Output:
        19
/***********************************************************/

import java.util.Scanner;

/**    Explanation:
        A contains the following hourglasses:

        1 1 1   1 1 0   1 0 0   0 0 0
        1       0       0       0
        1 1 1   1 1 0   1 0 0   0 0 0

        0 1 0   1 0 0   0 0 0   0 0 0
        1       1       0       0
        0 0 2   0 2 4   2 4 4   4 4 0

        1 1 1   1 1 0   1 0 0   0 0 0
        0       2       4       4
        0 0 0   0 0 2   0 2 0   2 0 0

        0 0 2   0 2 4   2 4 4   4 4 0
        0       0       2       0
        0 0 1   0 1 2   1 2 4   2 4 0

    The hourglass with the maximum sum (19) is:
        2 4 4
        2
        1 2 4
 **/

public class hourGlasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[][] = new int[6][6];

        int sum = 0, overAll = -10000;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = A[i][j] + A[i][j + 1] + A[i][j + 2] +
                        A[i + 1][j + 1] +
                        A[i + 2][j] + A[i + 2][j + 1] + A[i + 2][j + 2];
                if (sum > overAll) {
                    overAll = sum;
                }
            }
        }
        System.out.println(overAll);
    }
}
