/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 *
 */
public class CountPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(countPairs(str));
	}

	private static int countPairs(String str) {
		if (str.length() < 3) {
			return 0;
		}
		
		return str.charAt(0) == str.charAt(2) ? 1 + countPairs(str.substring(1)) : countPairs(str.substring(1));
	}

}
