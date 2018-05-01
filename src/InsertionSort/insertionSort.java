package InsertionSort;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code:
		 * for ii = 0 to A.length - 1
		 * 	current = A[ii];
		 * 	jj = ii - 1;
		 * 		while jj >= 0 && A[jj] > current
		 * 			A[jj + 1] = A[jj]
		 * 			jj = jj - 1
		 * 		A[jj + 1] = current
		 */
		
		int[] array = {9, 2, 3, 1, 4};
		new insertionSort().sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public void sort(int[] data) {
		for(int ii = 1; ii < data.length; ii++) {
			//2, 3, 1, 4
			//System.out.print(data[ii]);
			int current = data[ii];
			//jj = 0, 1, 2, 3
			int jj = ii - 1;
			//System.out.print(data[jj]);
			while(jj >= 0 && data[jj] > current) {

				data[jj + 1] = data[jj];
				jj = jj - 1;
				data[jj + 1] = current;
			}
		}
	}
}
