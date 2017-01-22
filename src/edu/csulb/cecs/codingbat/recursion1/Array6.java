/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p108997
 * 
 *         Given an array of ints, compute recursively if the array contains a
 *         6. We'll use the convention of considering only the part of the array
 *         that begins at the given index. In this way, a recursive call can
 *         pass index+1 to move down the array. The initial call will pass in
 *         index as 0.
 * 
 *         array6([1, 6, 4], 0) → true array6([1, 4], 0) → false array6([6], 0)
 *         → true
 *
 */
public class Array6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the array (n) : ");
		int n = scan.nextInt();

		int[] nums = new int[n];

		System.out.println("Enter the elements of the array separated by space or newline(\\n) : ");
		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}

		System.out.println(array6(nums, 0));
	}
	
	private static boolean array6(int[] nums, int index) {
		
		if (index == nums.length) {
			return false;
		}
		
		return nums[index] != 6 ? array6(nums, index + 1) : true; 
		  
	}


}
