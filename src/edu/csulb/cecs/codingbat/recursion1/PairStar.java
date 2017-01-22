/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p158175
 * 
 *         Given a string, compute recursively a new string where identical
 *         chars that are adjacent in the original string are separated from
 *         each other by a "*".
 * 
 *         pairStar("hello") → "hel*lo" pairStar("xxyy") → "x*xy*y"
 *         pairStar("aaaa") → "a*a*a*a"
 *
 */
public class PairStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(pairStar(str));
	}

	private static String pairStar(String str) {
		
		if (str.equals("")) {
			return str;
		}

		if (str.length() == 1) {
			return str;
		}

		return str.charAt(0) == str.charAt(1) ? str.charAt(0) + "*" + pairStar(str.substring(1))
				: str.charAt(0) + pairStar(str.substring(1));
	}

}
