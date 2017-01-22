/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p183174
 * 
 *         Given a string, return true if it is a nesting of zero or more pairs
 *         of parenthesis, like "(())" or "((()))". Suggestion: check the first
 *         and last chars, and then recur on what's inside them.
 * 
 *         nestParen("(())") → true nestParen("((()))") → true
 *         nestParen("(((x))") → false
 *
 */
public class NestParen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(nestParen(str));
	}

	private static boolean nestParen(String str) {

		if (str == "" || str.isEmpty()) {
			return true;
		}

		char begin = str.charAt(0);
		char end = str.charAt(str.length() - 1);

		if (begin == '(' && end == ')') {
			return nestParen(str.substring(1, str.length() - 1));
		}

		return false;
	}

}
