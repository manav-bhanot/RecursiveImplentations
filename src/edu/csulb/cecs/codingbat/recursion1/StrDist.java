/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Source : http://codingbat.com/prob/p195413
 * 
 *         Given a string and a non-empty substring sub, compute recursively the
 *         largest substring which starts and ends with sub and return its
 *         length.
 * 
 *         strDist("catcowcat", "cat") → 9 strDist("catcowcat", "cow") → 3
 *         strDist("cccatcowcatxx", "cat") → 9
 *
 */
public class StrDist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println("Enter the substring that you want to search");
		String sub = scan.next();

		System.out.println(strDist(str, sub));
	}

	private static int strDist(String str, String sub) {
		
		if (str.isEmpty() || str.equals("") || str.length() < 1) {
			return 0;
		}
		
		int len = 0;
		
		if (str.substring(0, sub.length()).equals(sub)) {
			len++;
			
		}
		
		return 0;
	}

}
