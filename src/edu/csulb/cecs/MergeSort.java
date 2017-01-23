/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of the array");
		for (int i=0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		mergeSort(0, arr.length-1, arr);
		
		System.out.println("Sorted Array after mergeSort");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
	
	private static void mergeSort(int begin, int end, int[] arr) {
		
		if (begin < end) {
			
			int mid = (begin + end) / 2;
			
			mergeSort(begin, mid, arr);
			mergeSort(mid + 1, arr.length - 1, arr);
			merge(begin, mid, end, arr);
		}
	}
	
	private static void merge(int i, int k, int j, int[] arr) {
		
		int n = k - i + 1;
		int m = j - k;
		
		// Create a left temp array to store the elements
		int left[] = new int[n];
		for (int index = 0; index < n; index++) {
			left[index] = arr[index + i];
		}
		
		// Create a right temp array to store the elements
		int right[] = new int[m];
		for (int index = 0; index < m; index++) {
			right[index] = arr[index + (k + 1)];
		}	
		
		int p = 0, q = 0;
		
		while(p < left.length && q < right.length) {
			if (left[p] < right[q]) {
				arr[i] = left[p];
				p++;
			} else if (left[p] >= right[q]) {
				arr[i] = right[q];
				q++;
			}
			i++;
		}
		
		// Merge the leftover elements
		while (p < left.length) {
			arr[i] = left[p];
			i++;
			p++;
		}
		
		while (q < right.length) {
			arr[i] = right[q];
			q++;
			i++;
		}
		
	}
}
