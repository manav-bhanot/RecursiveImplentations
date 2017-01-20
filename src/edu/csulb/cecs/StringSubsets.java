/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 *
 */
public class StringSubsets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();
		
		System.out.println();
		
		printSubsets("", str);

	}

	private static void printSubsets(String subset, String str) {
		
		if (str.equals("") || str.isEmpty()) {
			System.out.println(subset);
		} else {
			
			// Extract the 1st character and put the leftover string in the remStr variable
			String remStr = str.substring(1);

			// Recursive call - adding this letter in the subset
			printSubsets(subset + str.charAt(0), remStr);

			// Recursive call - not adding this letter in the subset
			printSubsets(subset, remStr);
		}
	}
}
