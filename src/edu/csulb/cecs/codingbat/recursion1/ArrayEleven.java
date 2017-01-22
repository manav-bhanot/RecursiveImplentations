/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p135988
 * 
 *         Given an array of ints, compute recursively the number of times that
 *         the value 11 appears in the array. We'll use the convention of
 *         considering only the part of the array that begins at the given
 *         index. In this way, a recursive call can pass index+1 to move down
 *         the array. The initial call will pass in index as 0.
 * 
 *         array11([1, 2, 11], 0) → 1
 * 
 *         array11([11, 11], 0) → 2
 * 
 *         array11([1, 2, 3, 4], 0) → 0
 *
 */
public class ArrayEleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the array (n) : ");
		int n = scan.nextInt();
		
		int[] nums = new int[n];
		
		System.out.println("Enter the elements of the array separated by space or newline(\\n) : ");
		for (int i=0; i < n; i++) {
			nums[i] = scan.nextInt();
		}
		
		System.out.println(array11(nums, 0));
	}
	
	private static int array11(int[] nums, int index) {
		if (index == nums.length) return 0;
		
		return (nums[index] == 11) ? 1 + array11(nums, index + 1) : array11(nums, index + 1);
	}

}
