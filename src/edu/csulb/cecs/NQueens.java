/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 *
 */
public class NQueens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the total number of queens");
		int n = scan.nextInt();
		
		int[][] board = new int[n][n];
		
		if (placeNQueens(board, 0, n)) {
			System.out.println("Below is the solution for placing " + n + " queens on a board of size : " + n + " x " + n);
			printBoardWithQueens(board);
		} else {
			System.out.println("No solution exist for placing " + n + " queens on a board of size : " + n + " x " + n);
		}
	}
	
	private static boolean placeNQueens(int[][] matrix, int col, int n) {
		
		if (n == 0 || col >= matrix[0].length) {
			return true;
		}
		
		for (int row = 0; row < matrix[0].length; row++) {
			
			if (isSafe(matrix, row, col)) {
				
				matrix[row][col] = 1;
				
				if (placeNQueens(matrix, col + 1, n - 1)) {
					return true;
				}
				
				matrix[row][col] = 0;
			}
		}
		
		return false;		
	}
	
	private static void printBoardWithQueens(int[][] matrix) {
		for (int i=0; i < matrix[0].length; i++) {
			for (int j=0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static boolean isSafe(int[][] matrix, int i, int j) {
		
		int row = i;
		int col = j;
		
		// Check if there is any queen lying in the left direction
		while (i >= 0) {
			if (matrix[i][j] == 1) {
				return false;
			}
			i--;
		}
		
		// Resetting i back to the current cell for checking in other directions
		i = row;
		
		// Check if there is any queen lying in the up direction
		while (j >= 0) {
			if (matrix[i][j] == 1) {
				return false;
			}
			j--;
		}
		
		j = col;
		
		// Check if any queen is lying in the diagonal directions.
		while (j >= 0 && i >= 0) {
			if (matrix[i][j] == 1) {
				return false;
			}
			i--;
			j--;
		}
		
		i = row;
		j = col;
		
		while (j >= 0 && i < matrix[0].length) {
			if (matrix[i][j] == 1) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
