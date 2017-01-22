/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem src : http://codingbat.com/prob/p170924
 * 
 *         Given a string, compute recursively (no loops) a new string where all
 *         appearances of "pi" have been replaced by "3.14".
 * 
 *         changePi("xpix") → "x3.14x"
 * 
 *         changePi("pipi") → "3.143.14"
 * 
 *         changePi("pip") → "3.14p"
 *
 */
public class ChangePi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(changePi(str));

	}

	private static String changePi(String str) {
		if (str.length() < 2) {
			return str;
		}
		
		if (str.substring(0,2).equals("pi")) {
			return "3.14" + changePi(str.substring(2));
		} else {
			return str.charAt(0) + changePi(str.substring(1));
		}
	}

}
