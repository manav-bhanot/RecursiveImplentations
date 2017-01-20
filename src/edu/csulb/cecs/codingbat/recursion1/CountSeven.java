/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author 014838159-sa
 * 
 *         Problem source : http://codingbat.com/prob/p101409
 * 
 *         Given a non-negative int n, return the count of the occurrences of 7
 *         as a digit, so for example 717 yields 2. (no loops). Note that mod
 *         (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide
 *         (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * 
 *         count7(717) → 2
 * 
 *         count7(7) → 1
 * 
 *         count7(123) → 0
 *
 */
public class CountSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = scan.nextInt();

		System.out.println(count7(n));

	}

	private static int count7(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		return (n % 10 == 7) ? 1 + count7(n/10) : count7(n/10);
	}

}
