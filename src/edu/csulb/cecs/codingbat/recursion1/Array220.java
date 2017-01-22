/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p173469
 * 
 *         Given an array of ints, compute recursively if the array contains
 *         somewhere a value followed in the array by that value times 10. We'll
 *         use the convention of considering only the part of the array that
 *         begins at the given index. In this way, a recursive call can pass
 *         index+1 to move down the array. The initial call will pass in index
 *         as 0.
 * 
 *         array220([1, 2, 20], 0) → true
 * 
 *         array220([3, 30], 0) → true *
 * 
 *         array220([3], 0) → false
 *
 */
public class Array220 {

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

		System.out.println(array220(nums, 0));

	}

	private static boolean array220(int[] nums, int index) {

		if (index == nums.length) {
			return false;
		}

		if (index != 0 && nums[index - 1] * 10 == nums[index]) {
			return true;
		}

		return array220(nums, index + 1);
	}

}
