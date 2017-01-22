/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p104029
 * 
 *         Given a string, return recursively a "cleaned" string where adjacent
 *         chars that are the same have been reduced to a single char. So
 *         "yyzzza" yields "yza".
 * 
 *         stringClean("yyzzza") → "yza" stringClean("abbbcdd") → "abcd"
 *         stringClean("Hello") → "Helo"
 *
 */
public class StringClean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(stringClean(str));
	}

	private static String stringClean(String str) {
		if (str.length() == 1 || str.equals("") || str.isEmpty()) {
			return str;
		}
		
		return str.charAt(0) == str.charAt(1) ? stringClean(str.substring(1)) : str.charAt(0) + stringClean(str.substring(1));
	}

}
