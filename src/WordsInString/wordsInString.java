package WordsInString;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class wordsInString {

//	public static void main(String[] args) {
//		String sentence = "This is a senctance with seven words";
//		System.out.println(wordCount(sentence));
//	}
//
//	public static int wordCount(String str) {
//		int word_count = 1;
//		char space = ' ';
//
//		for(int ii = 0; ii < str.length(); ii++) {
//			if(str.charAt(ii) == space) {
//				word_count++;
//			}
//		}
//		return word_count;
//	}
// Complete the diagonalDifference function below.
//static int diagonalDifference(int[][] a) {
//	int[][] temp;
//	for (int ii = 0; ii < a.length; ii++) {
//		System.out.println(a[ii]);
//	}
//	return 0;
//}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int n = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		int[][] a = new int[n][n];
//
//		for (int i = 0; i < n; i++) {
//			String[] aRowItems = scanner.nextLine().split(" ");
//			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//			for (int j = 0; j < n; j++) {
//				int aItem = Integer.parseInt(aRowItems[j]);
//				a[i][j] = aItem;
//			}
//		}
//
//		int result = diagonalDifference(a);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
//
//		scanner.close();
		int mat[][] = { {10, 20, 30, 40, 50, 60, 70, 80, 90},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50, 51, 89},
		};


		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println("Values at arr["+i+"]["+j+"] is "+mat[i][j]);
			}
		}
	}

}
