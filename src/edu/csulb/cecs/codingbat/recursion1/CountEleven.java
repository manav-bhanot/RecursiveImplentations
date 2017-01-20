/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author 014838159-sa
 * 
 *         Problem Source : http://codingbat.com/prob/p167015
 *
 *         Given a string, compute recursively (no loops) the number of "11"
 *         substrings in the string. The "11" substrings should not overlap.
 * 
 *         count11("11abc11") → 2
 * 
 *         count11("abc11x11x11") → 3
 * 
 *         count11("111") → 1
 */
public class CountEleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(count11(str));

	}

	private static int count11(String s) {
		if (s.length() < 2) {
			return 0;
		}
		
		return (s.substring(0, 2).equals("11")) ? 1 + count11(s.substring(2)) : count11(s.substring(1));
	}

}
