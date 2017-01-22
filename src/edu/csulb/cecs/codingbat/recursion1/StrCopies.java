/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p118182
 * 
 *         Given a string and a non-empty substring sub, compute recursively if
 *         at least n copies of sub appear in the string somewhere, possibly
 *         with overlapping. N will be non-negative.
 * 
 *         strCopies("catcowcat", "cat", 2) → true strCopies("catcowcat", "cow",
 *         2) → false strCopies("catcowcat", "cow", 1) → true
 *
 */
public class StrCopies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println("Enter the substring that you want to search : ");
		String sub = scan.next();

		System.out.println("Enter the minimum number of copies : ");
		int n = scan.nextInt();

		System.out.println(strCopies(str, sub, n));
	}

	private static boolean strCopies(String str, String sub, int n) {

		/**
		 * Using strCount function that actually counts the total occurences of
		 * the sub in the string and compares with n However this is not
		 * necessarily required as we need to return the result as soon as the
		 * nth occurence is found.
		 */

		// return n <= strCount(str, sub);

		/**
		 * Below is another implementation that overcomes the run time issue
		 * inherent in the above approach
		 */
		
		if (n == 0) return true;

		if (str.length() < sub.length())
			return false;

		return str.substring(0, sub.length()).equals(sub) ? strCopies(str.substring(1), sub, n - 1)
				: strCopies(str.substring(1), sub, n);
	}

	private static int strCount(String str, String sub) {
		if (str.isEmpty() || str.equals("") || str.length() < sub.length()) {
			return 0;
		}

		return str.substring(0, sub.length()).equals(sub) ? 1 + strCount(str.substring(1), sub)
				: strCount(str.substring(1), sub);
	}

}
