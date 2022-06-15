/**
 * 
 */
package edu.csulb.cecs;

/**
 * @author Manav
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[] {1,4,5,8,12,16,24,29,34,39,41,43,58,60,67,76,77,79,89,93};
		
		int key = 12;
		
		System.out.println(bSearch(0, arr.length-1, arr, key));

	}
	
	static int bSearch(int leftIdx, int rightIdx, int[] arr, int key) {

		if (leftIdx > rightIdx) return -1;

		int middleIdx = (leftIdx+rightIdx)/2;

		if (arr[middleIdx] == key) {
			return middleIdx;
		} else if (arr[middleIdx] > key) { // key should be there in the left subarray
			return bSearch(leftIdx, middleIdx - 1, arr, key);
		} else { // search for the key in the right subarray
			return bSearch(middleIdx + 1, rightIdx, arr, key);
		}
	}
}
