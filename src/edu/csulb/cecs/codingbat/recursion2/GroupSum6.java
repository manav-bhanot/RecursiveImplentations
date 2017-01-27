/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion2;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p199368
 *
 *         Given an array of ints, is it possible to choose a group of some of
 *         the ints, beginning at the start index, such that the group sums to
 *         the given target? However, with the additional constraint that all
 *         6's must be chosen. (No loops needed.)
 * 
 *         groupSum6(0, [5, 6, 2], 8) → true
 * 
 *         groupSum6(0, [5, 6, 2], 9) → false
 * 
 *         groupSum6(0, [5, 6, 2], 7) → false
 */
public class GroupSum6 {

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

		System.out.println("Enter the target : ");
		int target = scan.nextInt();

		System.out.println(groupSum6(0, nums, target));

	}

	private static boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return target == 0;
		}

		if (nums[start] == 6) {
			// If we encounter a 6 in the array then make sure that it is always
			// included in the output selection of elements
			return groupSum6(start + 1, nums, target - nums[start]);
		}

		// Key idea: nums[start] is chosen or it is not.
		// Deal with nums[start], letting recursion
		// deal with all the rest of the array.


		// Recursive call trying the case that nums[start] is chosen --
		// subtract it from target in the call.
		if (groupSum6(start + 1, nums, target - nums[start])) {
			return true;
		}

		// Recursive call trying the case that nums[start] is not chosen.
		if (groupSum6(start + 1, nums, target)) {
			return true;
		}

		// If neither of the above worked, it's not possible.
		return false;
	}

}
