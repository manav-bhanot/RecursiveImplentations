/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 * 
 * Recursive Insight :
 * First and Last Letter Match and the interior is pallindrome
 * 
 * Base Case ?
 * 
 * Test Strings :
 * wasitacaroracatisaw
 * gohangasalamiimalasagnahog
 * aquickbrownfoxjumpsoverthelazydog
 * aabaa
 * awasitacaroracatisaw
 *
 */
public class Pallindromes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = scan.next();
		
		System.out.println(isPallindrome(0, str.length()-1, str));
	}
	
	static boolean isPallindrome(int i, int j, String s) {
		
		System.out.println("i = " + i + " :: j = " + j);
		
		if (i >= j) {
			return true;
		}
		
		// Try it with below return and see your code going into infinite loop
		// return ((s.charAt(i) == s.charAt(j)) && isPallindrome(i++, j--, s));
		
		return ((s.charAt(i) == s.charAt(j)) && isPallindrome(++i, --j, s));
	}
}
