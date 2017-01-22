/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem Source : http://codingbat.com/prob/p158888
 * 
 *         Given base and n that are both 1 or more, compute recursively (no
 *         loops) the value of base to the n power, so powerN(3, 2) is 9 (3
 *         squared).
 * 
 *         powerN(3, 1) → 3 powerN(3, 2) → 9 powerN(3, 3) → 27
 *
 */
public class PowerN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base : ");
		int base = scan.nextInt();

		System.out.println("Enter n : ");
		int n = scan.nextInt();

		System.out.println(powerN(base, n));
	}

	private static int powerN(int base, int n) {
		
		if (n == 0) return 1;
		if (n == 1) return base;
		
		if (n % 2 == 0) {
			return (powerN(base, n/2) * powerN(base, n/2));
		} else {
			return (base * powerN(base, n/2) * powerN(base, n/2));
		}
	}

}
