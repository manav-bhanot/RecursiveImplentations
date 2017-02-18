/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * @author Manav
 *
 */
public class Maze {

	public static final int next[][] = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the size of the maze : ");
		 * 
		 * System.out.println("\nEnter rows : "); int rows = scan.nextInt();
		 * 
		 * System.out.println("\nEnter columns"); int cols = scan.nextInt();
		 * 
		 * char[][] maze = new char[rows][cols];
		 */

		char[][] maze = { { '.', '.', '#' }, { '#', '.', '.' }, { '.', '.', '.' }, { '.', '#', 'T' } };
		
		printMaze(maze);

		System.out.println(solveMaze(maze, 0, 0));

	}

	private static void printMaze(char[][] maze) {
		for (char c[] : maze) {
			for (char x : c) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
	}

	/**
	 * Maze is a m x n matrix having m rows and n columns Each cell in the maze
	 * has the below values # -> represents a wall that is you can't go in that
	 * cell . -> represents
	 * 
	 * @param matrix
	 * @param i
	 * @param j
	 * @return
	 */
	private static boolean solveMaze(char[][] matrix, int i, int j) {

		/*if (!isValid(matrix, i, j))
			return false;*/
		
		if (matrix[i][j] == '#')
			return false;

		// Check if the current cell is the target. If yes then return t
		if (matrix[i][j] == 'T' || matrix[i][j] == '.')
			return true;

		for (int[] dir : next) {
			int x = dir[0];
			int y = dir[1];

			// Check if this particular direction is
			if (!blocked(matrix, i + x, j + y) && isValid(matrix, i + x, j + y)) {
				matrix[i][j] = '#';
				i = i + x;
				y = y + j;

				if (solveMaze(matrix, i, j)) {
					return true;
				}
			}
		}

		matrix[i][j] = '.';
		return false;
	}

	private static boolean blocked(char[][] m, int i, int j) {
		return (i >= 0 && i < m.length && j >= 0 && j < m[0].length && m[i][j] == '.');
	}

	private static boolean isValid(char[][] m, int i, int j) {
		return (i >= 0 && i < m.length && j >= 0 && j < m[0].length);
	}

}
