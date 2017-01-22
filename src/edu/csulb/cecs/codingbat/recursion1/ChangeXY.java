/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p101372
 *
 *         Given a string, compute recursively (no loops) a new string where all
 *         the lowercase 'x' chars have been changed to 'y' chars.
 * 
 *         changeXY("codex") → "codey" changeXY("xxhixx") → "yyhiyy"
 *         changeXY("xhixhix") → "yhiyhiy"
 */
public class ChangeXY {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(changeXY(str));
	}

	private static String changeXY(String str) {
		if (str.equals("")) {
			return "";
		}

		return str.charAt(0) == 'x' ? 'y' + changeXY(str.substring(1)) : str.charAt(0) + changeXY(str.substring(1));
	}

}
