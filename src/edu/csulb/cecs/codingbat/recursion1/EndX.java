/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem Source : http://codingbat.com/prob/p105722
 * 
 *         Given a string, compute recursively a new string where all the
 *         lowercase 'x' chars have been moved to the end of the string.
 * 
 *         endX("xxre") → "rexx" endX("xxhixx") → "hixxxx" endX("xhixhix") →
 *         "hihixxx"
 *
 */
public class EndX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(endX(str));
	}

	private static String endX(String str) {
		
		String s = "";
		
		if (str.equals("")) {
			return s;
		}
		
		if (str.charAt(0) == 'x') {
			s += 'x';
			return endX(str.substring(1)) + s;
		} else {
			return str.charAt(0) + endX(str.substring(1));
		}		
	}

}
