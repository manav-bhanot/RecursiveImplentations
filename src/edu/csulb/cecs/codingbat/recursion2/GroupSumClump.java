/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion2;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p105136
 * 
 *         Given an array of ints, is it possible to choose a group of some of
 *         the ints, such that the group sums to the given target, with this
 *         additional constraint: if there are numbers in the array that are
 *         adjacent and the identical value, they must either all be chosen, or
 *         none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2},
 *         either all three 2's in the middle must be chosen or not, all as a
 *         group. (one loop can be used to find the extent of the identical
 *         values).
 * 
 *         groupSumClump(0, [2, 4, 8], 10) → true groupSumClump(0, [1, 2, 4, 8,
 *         1], 14) → true groupSumClump(0, [2, 4, 4, 8], 14) → false
 *
 */
public class GroupSumClump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return target == 0;
		}

		// This problem can be viewed as merging adjacent identical elements of
		// an array into
		// one element and then either selecting it or not selecting it
		int sum = 0;

		while (start < nums.length - 1 && nums[start] == nums[start + 1]) {
			sum += nums[start];
			start++;
		}

		if (groupSumClump(start + 1, nums, target - sum - nums[start]) || groupSumClump(start + 1, nums, target))
			return true;

		return false;
	}

}
