/**
 * 
 */
package edu.csulb.cecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Manav
 *
 */
public class NQueens2 {

	private int N = 4;
	private Integer[] queenPositions = new Integer[N];

	private List<Integer[]> solutions = new ArrayList<Integer[]>();

	private void solveNQueens(int row) {
		
		if (row == queenPositions.length) {
			solutions.add(queenPositions.clone());
			return;
		}

		for (int col = 0; col < N; col++) {
			queenPositions[row] = col;
			if (isSafe(row, col)) {				
				solveNQueens(row + 1);
			}
		}
	}

	private boolean isSafe(int row, int col) {
		for (int i = 0; i < row; i++) {
			int x_diff = row - i;
			int y_diff = col - queenPositions[i];
			if (Math.abs(x_diff) == Math.abs(y_diff) || col == queenPositions[i])
				return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NQueens2 obj = new NQueens2();
		
		//obj.initializePositionsArray();
		
		obj.solveNQueens(0);
		
		System.out.println(obj.solutions.size());
		
		for (Integer[] sols : obj.solutions) {
			for (int i=0; i < sols.length; i++) {
				System.out.print(i + "," + sols[i] + "\t");
			}
			System.out.println();
		}
	}

	/*private void initializePositionsArray() {
		for (int i = 0; i < N; i++) {
			queenPositions[i] = -1;
		}
	}*/

}
