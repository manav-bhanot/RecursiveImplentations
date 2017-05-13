/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion2;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p185204
 *
 *         Given an array of ints, is it possible to divide the ints into two
 *         groups, so that the sums of the two groups are the same. Every int
 *         must be in one group or the other. Write a recursive helper method
 *         that takes whatever arguments you like, and make the initial call to
 *         your recursive helper from splitArray(). (No loops needed.)
 * 
 *         splitArray([2, 2]) → true splitArray([2, 3]) → false splitArray([5,
 *         2, 3]) → true
 */
public class SplitArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Algorithm used : 1. Find the sum of the whole array 2. If the sum is odd,
	 * there is no way you can find a solution 3. If the sum is even, find if
	 * you can find a group of elements whose sum = (sum_of_array)/2
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean splitArray(int[] nums) {
		int arraySum = findArraySum(0, nums);
		if (arraySum % 2 != 0)
			return false;

		return isSplitPossible(0, nums, arraySum / 2);
	}

	public static int findArraySum(int start, int[] nums) {
		if (start >= nums.length)
			return 0;
		return nums[start] + findArraySum(start + 1, nums);
	}

	public static boolean isSplitPossible(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;

		return (isSplitPossible(start + 1, nums, target - nums[start]) || isSplitPossible(start + 1, nums, target));
	}

	// Below is another effective implementation that I got from a blogging site
	// Site : http://gregorulm.com/codingbat-java-recursion-2/

	private static boolean helper(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length)
			return sum1 == sum2;
		return helper(start + 1, nums, sum1 + nums[start], sum2) || helper(start + 1, nums, sum1, sum2 + nums[start]);
	}

}
