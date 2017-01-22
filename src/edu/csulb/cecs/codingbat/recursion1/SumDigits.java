/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 *
 */
public class SumDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = scan.nextInt();

		System.out.println(sumDigits(n));
	}

	private static int sumDigits(int n) {
		if (n == 0) return 0;
		return n%10 + sumDigits(n/10);
	}

}
