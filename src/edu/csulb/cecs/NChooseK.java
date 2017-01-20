/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 * 
 * Given a value 'n' and 'k', In how many ways you can choose k items out of n items
 * 
 * Intutive approach :: C(n,k) = C(n-1,k) + C(n-1, k-1)
 */
public class NChooseK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = scan.nextInt();
		
		System.out.println("Enter k : ");
		int k = scan.nextInt();
		
		System.out.println(C(n,k));

	}
	
	static int C(int n, int k) {
		if ( n == k || k == 0) {
			return 1;
		}
		
		return C(n-1, k) + C(n-1, k-1);
	}

}
