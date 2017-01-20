/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author 014838159-sa
 * 
 *         Problem Source : http://codingbat.com/prob/p107330
 * 
 *         We have bunnies standing in a line, numbered 1, 2, ... The odd
 *         bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4,
 *         ..) we'll say have 3 ears, because they each have a raised foot.
 *         Recursively return the number of "ears" in the bunny line 1, 2, ... n
 *         (without loops or multiplication).
 * 
 *         bunnyEars2(0) → 0
 * 
 *         bunnyEars2(1) → 2
 * 
 *         bunnyEars2(2) → 5
 * 
 * 
 *
 */
public class BunnyEars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = scan.nextInt();

		System.out.println(bunnyEars2(n));

	}

	private static int bunnyEars2(int bunnies) {

		if (bunnies == 0) {
			return 0;
		}

		return (bunnies % 2 == 0) ? bunnyEars2(bunnies - 1) + 3 : bunnyEars2(bunnies - 1) + 2;

	}

}
