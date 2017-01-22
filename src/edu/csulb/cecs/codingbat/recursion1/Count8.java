/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p192383
 * 
 *         Given a non-negative int n, compute recursively (no loops) the count
 *         of the occurrences of 8 as a digit, except that an 8 with another 8
 *         immediately to its left counts double, so 8818 yields 4. Note that
 *         mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
 *         divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * 
 *         count8(8) → 1
 * 
 *         count8(818) → 2
 * 
 *         count8(8818) → 4
 *
 */
public class Count8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = scan.nextInt();

		System.out.println(count8(n));
	}

	private static int count8(int n) {
		
		if (n==0) return 0;
		
		return (n % 100 == 88) ? 2 + count8(n/10) : ((n % 10 == 8) ? 1 + count8(n/10) : count8(n/10));

	}

}
