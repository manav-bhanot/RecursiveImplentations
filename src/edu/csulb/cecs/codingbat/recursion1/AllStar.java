/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p183394
 * 
 *         Given a string, compute recursively a new string where all the
 *         adjacent chars are now separated by a "*".
 * 
 *         allStar("hello") → "h*e*l*l*o"
 * 
 *         allStar("abc") → "a*b*c"
 * 
 *         allStar("ab") → "a*b"
 *
 */
public class AllStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(allStar(str));

	}

	private static String allStar(String str) {
		
		if (str.isEmpty() || str.length() == 1) {
			return str;
		}
		
		return str.charAt(0) + "*" + allStar(str.substring(1));
		
	}

}
