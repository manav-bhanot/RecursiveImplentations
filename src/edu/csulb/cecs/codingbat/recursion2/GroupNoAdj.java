/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion2;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p169605
 * 
 *         Given an array of ints, is it possible to choose a group of some of
 *         the ints, such that the group sums to the given target with this
 *         additional constraint: If a value in the array is chosen to be in the
 *         group, the value immediately following it in the array must not be
 *         chosen. (No loops needed.)
 * 
 *         groupNoAdj(0, [2, 5, 10, 4], 12) → true groupNoAdj(0, [2, 5, 10, 4],
 *         14) → false groupNoAdj(0, [2, 5, 10, 4], 7) → false
 *
 */
public class GroupNoAdj {

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

		System.out.println(groupNoAdj(0, nums, target));
	}

	private static boolean groupNoAdj(int start, int[] nums, int target) {

		if (start >= nums.length) {
			return target == 0;
		}
		
		// Include nums[start] but then dont include nums[start + 1] in the next level of recursion
		if (groupNoAdj(start + 2, nums, target - nums[start])) return true;
		
		// don't include num[start] and include nums[start + 1]
		if (groupNoAdj(start + 1, nums, target)) return true;
		
		return false;
	}

}
