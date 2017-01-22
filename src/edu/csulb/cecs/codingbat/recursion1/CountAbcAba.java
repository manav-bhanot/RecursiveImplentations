/**
 * 
 */
package edu.csulb.cecs.codingbat.recursion1;

import java.util.Scanner;

/**
 * @author Manav
 * 
 *         Problem source : http://codingbat.com/prob/p161124
 * 
 *         Count recursively the total number of "abc" and "aba" substrings that
 *         appear in the given string.
 * 
 *         countAbc("abc") → 1
 * 
 *         countAbc("abcxxabc") → 2
 * 
 *         countAbc("abaxxaba") → 2
 *
 */
public class CountAbcAba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scan.next();

		System.out.println(countAbc(str));
	}
	
	private static int countAbc(String str) {
		
		if (str.equals("") || str.length() < 3) {
			return 0;
		}
		
		String s = str.substring(0, 3);
		
		return (s.equals("abc") || s.equals("aba")) ? 1 + countAbc(str.substring(1)) : countAbc(str.substring(1));
	}


}
