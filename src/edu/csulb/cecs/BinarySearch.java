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
		
		int key = 45;
		
		System.out.println(bSearch(0, arr.length-1, arr, key));

	}
	
	static int bSearch(int i, int j, int[] arr, int key) {
		
		if (i > j) return -1;
		
		int mid = (int)Math.floor((i+j)/2);
		
		if (arr[mid] == key) {
			return mid;
		} else if (arr[mid] > key) { // key should be there in the left subarray
			return bSearch(i, mid - 1, arr, key);
		} else { // search for the key in the right subarray
			return bSearch(mid + 1, j, arr, key);
		}
	}

}
