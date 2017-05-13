/**
 * 
 */
package edu.csulb.cecs;

/**
 * @author Manav
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = new int[] { 5, 8, 6, 2, 7, 1, 6, 9, 3, 4, 6 };

		// Print the sorted array
		System.out.println("Input Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " | ");
		}
		
		System.out.println();

		quicksort(a, 0, a.length - 1);

		// Print the sorted array
		System.out.println("\n\nSorted Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " | ");
		}
	}

	private static void quicksort(int[] arr, int begin, int end) {

		// Find the median of array starting from begin and ending at end
		int indexOfPivot = medianOfThree(arr, begin, end);

		// Replace the last element of the array with the pivot element
		if (indexOfPivot != end) {
			arr[indexOfPivot] = arr[indexOfPivot] ^ arr[end];
			arr[end] = arr[indexOfPivot] ^ arr[end];
			arr[indexOfPivot] = arr[indexOfPivot] ^ arr[end];
		}		

		int l = begin;
		int r = end - 1;

		while (l < r) {
			if (arr[l] >= arr[end] && arr[r] <= arr[end]) {
				// swap left and right element
				arr[l] = arr[l] ^ arr[r];
				arr[r] = arr[l] ^ arr[r];
				arr[l] = arr[l] ^ arr[r];

				l++;
				r--;
			} else if (arr[l] <= arr[end]) {
				l++;
			} else if (arr[r] >= arr[end]) {
				r--;
			}
		}

		// Swap a[l] with the last element now
		/*arr[l] = arr[l] ^ arr[end];
		arr[end] = arr[l] ^ arr[end];
		arr[l] = arr[l] ^ arr[end];*/
		
		int temp = arr[l];
		arr[l] = arr[end];
		arr[end] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.println();

		// Recursively call quicksort with the left array and the right array
		if (begin < end) {
			quicksort(arr, begin, l - 1);
			quicksort(arr, l + 1, end);
		}
	}

	/**
	 * Returns the index of the pivot element
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private static int medianOfThree(int[] arr, int begin, int end) {
		if (arr[begin] <= arr[end] && arr[begin] <= arr[(end - begin + 1) / 2]) {
			if (arr[end] <= arr[(end - begin + 1) / 2]) {
				return end;
			} else {
				return (end - begin + 1) / 2;
			}
		} else if (arr[end] <= arr[begin] && arr[end] <= arr[(end - begin + 1) / 2]) {
			if (arr[begin] <= arr[(end - begin + 1) / 2]) {
				return begin;
			} else {
				return (end - begin + 1) / 2;
			}
		} else {
			if (arr[begin] <= arr[end]) {
				return begin;
			} else {
				return end;
			}
		}
	}

}
