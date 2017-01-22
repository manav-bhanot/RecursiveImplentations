/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p194781
 * 
 *         We have triangle made of blocks. The topmost row has 1 block, the
 *         next row down has 2 blocks, the next row has 3 blocks, and so on.
 *         Compute recursively (no loops or multiplication) the total number of
 *         blocks in such a triangle with the given number of rows.
 * 
 *         triangle(0) → 0 triangle(1) → 1 triangle(2) → 3
 *
 */
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter rows : ");
		int rows = scan.nextInt();

		System.out.println(triangle(rows));
	}

	private static int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		
		return rows + triangle(rows - 1);
	}

}
