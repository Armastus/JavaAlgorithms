package SelectionSort;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code:
		 * for ii = 0 to A.length - 2
		 * 	minIndex = ii;
		 * 	for jj = ii + 1 to A.length - 1;
		 * 		if (data[jj] < data[minIndex])
		 * 			minIndex = jj;
		 * 	tmp = data[minIndex];
		 * 
		 * 	data[minIndex] = data[ii]
		 * 
		 * 	data[ii] = tmp;
		 */
		int[] array = {7, 3, 8, 1, 2};
		new selectionSort().sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public void sort(int[] data) {
		for(int ii = 0; ii < data.length - 2; ii++) {
			//7 3 8
			//System.out.print(data[ii]);
			int minIndex = ii;
			for(int jj = ii + 1; jj < data.length; jj++) {
				/*
				 * jj = 0 + 1 = 1 [3] while 1 < 5 -> [3, 8, 1, 2]
				 * jj = 1 + 1 = 2 [8] while 2 < 5 -> [8, 1, 2]
				 * jj = 2 + 1 = 3 [1] while 3 < 5 -> [1, 2]
				 * jj = 3 + 1 = 4 [2] while 4 < 5 -> [2]
				 */
				//System.out.print(data[jj]);
				
				//if(3 < 7)
				if(data[jj] < data[minIndex]) {
					//0[7] = 1[3]
					minIndex = jj;
				}
			}
					//tmp = 3
					int tmp = data[minIndex];
//					//3 = 7
					data[minIndex] = data[ii];
//					//7 = 3
					data[ii] = tmp;
		}
	}
}
