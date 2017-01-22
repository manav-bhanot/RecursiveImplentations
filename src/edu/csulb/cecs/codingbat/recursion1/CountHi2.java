/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem Source : http://codingbat.com/prob/p143900
 * 
 *         Given a string, compute recursively the number of times lowercase
 *         "hi" appears in the string, however do not count "hi" that have an
 *         'x' immedately before them.
 * 
 *         countHi2("ahixhi") → 1 countHi2("ahibhi") → 2 countHi2("xhixhi") → 0
 *
 */
public class CountHi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(countHi2(str));
	}

	private static int countHi2(String str) {
		if (str.length() < 2) {
			return 0;
		}
		
		if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
			return countHi2(str.substring(3));
		} else if (str.substring(0,2).equals("hi")) {
			return 1 + countHi2(str.substring(2));
		} else {
			return countHi2(str.substring(1));
		}
	}
}
