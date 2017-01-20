/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 * 
 * Given a string s, this code prints all the permutations of the string
 * Eg.: s = "abc" 
 * sol : {abc, acb, bac, bca, cab, cba}
 * 
 * Q: is there a small change in the code that you can make to produce all the combinations
 * Eg.: s = "abc"
 * sol : {"", a, b, c, ab, ac, bc, abc}
 * 
 * Q: If a certain letter in the string is repeated, this code prints duplicate permutations.
 * How can you remove those duplicate permutations ?
 *
 */
public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();
		
		System.out.println();
		
		printPermutations("", str);		
	}

	private static void printPermutations(String perm, String str) {
		
		if (str.equals("")) {
			System.out.println(perm);
		}
		
		for (int i=0; i < str.length(); i++) {
			String res = perm + str.charAt(i);
			String remStr = str.substring(0, i) + str.substring(i+1);
			
			printPermutations(res, remStr);
		}
	}

}
