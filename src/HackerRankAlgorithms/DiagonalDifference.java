package HackerRankAlgorithms;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int arrLength = a.length;
        int indexLength = arrLength - 1;

        for (int ii = 0; ii < arrLength; ii++) {
            primaryDiagonal += a[ii][ii]; //11
            secondaryDiagonal += a[ii][indexLength]; //4
            indexLength -= 1;
        }
        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) {
        int[][] a = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};

        int result = diagonalDifference(a);

        System.out.print(String.valueOf(result));
    }
}

