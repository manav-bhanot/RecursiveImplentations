/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem Source : http://codingbat.com/prob/p186177
 * 
 *         Given a string and a non-empty substring sub, compute recursively the
 *         number of times that sub appears in the string, without the sub
 *         strings overlapping.
 * 
 *         strCount("catcowcat", "cat") → 2 strCount("catcowcat", "cow") → 1
 *         strCount("catcowcat", "dog") → 0
 *
 */
public class StrCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println("Enter the substring that you want to search");
		String sub = scan.next();

		System.out.println(strCount(str, sub));

	}

	private static int strCount(String str, String sub) {
		if (str.isEmpty() || str.equals("") || str.length() < sub.length()) {
			return 0;
		}

		return str.substring(0, sub.length()).equals(sub) ? 1 + strCount(str.substring(sub.length()), sub)
				: strCount(str.substring(1), sub);

	}

}
