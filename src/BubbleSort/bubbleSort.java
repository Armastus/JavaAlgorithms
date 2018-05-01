package BubbleSort;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		/* Pseudo-code:
		 * for ii = 0 to A.length-1
		 * 	for jj = 0 to A.lenght-1-ii
		 * 		if A[jj] > A[jj+1]
		 * 			tmp = A[jj+1]]
		 * 			A[jj+1] = A[jj]
		 * 			A[jj] = tmp
		 */
		int[] array = {5, 4, 1, 3, 2};
		new bubbleSort().sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public void sort(int[] data) {
		for(int ii = 0; ii < data.length - 1; ii++) {
			//4 6 1 3
			//System.out.print(data[ii]);
			for(int jj = 0; jj < data.length - 1 - ii; jj++) {
				/*
				 * 5 - 1 - 0 = 4 -> [5, 4, 1, 3]
				 * 5 - 1 - 1 = 3 -> [5, 4, 1] 
				 * 5 - 1 - 2 = 2 -> [5, 4]
				 * 5 - 1 - 4 = 1 -> [5]
				 */
				//System.out.println(data[jj]);
				if(data[jj] > data[jj + 1]) {
					//tmp = 4
					int tmp = data[jj + 1];
					//4 is swapped with 5
					data[jj + 1] = data[jj];
					//5 is swapped with 
					data[jj] = tmp;
				}
			}
		}
	}
}
