/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author 014838159-sa
 * 
 *         Problem src : http://codingbat.com/prob/p170371
 * 
 *         Given a string, compute recursively (no loops) the number of
 *         lowercase 'x' chars in the string.
 * 
 *         countX("xxhixx") → 4
 * 
 *         countX("xhixhix") → 3
 * 
 *         countX("hi") → 0
 *
 */
public class CountX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(countx(str));

	}

	private static int countx(String str) {
		if (str.isEmpty()) {
			return 0;
		}
		
		return (str.charAt(0)=='x') ? 1 + countx(str.substring(1)) : countx(str.substring(1));
	}

}
