/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 * 
 * Finding x^n using recursion
 *
 */
public class Exponentiation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x : ");
		int x = scan.nextInt();
		
		System.out.println("Enter n : ");
		int n = scan.nextInt();
		
		System.out.println(exp(x,n));
	}
	
	static long exp(long x, long n) {
		
		// Check if n = 0
		if (n == 0) {
			return 1;
		}
		// Else check if n is even
		else if (n % 2 == 0) {
			long result = exp(x, n/2);
			return result * result;
		} else {
			return x * exp(x, n-1);
		}
	}

}
