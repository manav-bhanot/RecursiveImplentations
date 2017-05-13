package edu.csulb.cecs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GridArea {

	public static void main(String[] args) {

		char[][] grid = readGrid();

		displayGrid(grid);

		boolean[][] isVisited = new boolean[10][10];
		
		int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

		List<Integer> areasInTheGrid = new ArrayList<Integer>();

		// Calculate the Areas
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {

				if (!isVisited[row][col] && grid[row][col] == 'o') {
					areasInTheGrid.add(calcuateArea(grid, row, col, isVisited, directions));
				}
			}
		}

		// Print the areas
		for (int a1 = 0; a1 < areasInTheGrid.size(); a1++) {
			System.out.println("Area " + (a1 + 1) + " = " + areasInTheGrid.get(a1));
		}
	}

	public static int calcuateArea(char[][] grid, int i, int j, boolean[][] isVisited, int[][] directions) {
		
		// System.out.println(i + " : " + j);
		
		int area = 1;

		if (grid[i][j] == '#' || isVisited[i][j]) {
			return 0;
		} else {
			for (int dir[] : directions) {
				int x = dir[0];
				int y = dir[1];
				isVisited[i][j] = true;
				area = area + calcuateArea(grid, i + x, j + y, isVisited, directions);
			}
		}
		return area;
	}

	public static char[][] readGrid() {
		char[][] myArray = new char[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				myArray[i][j] = '#';
			}
		}

		try {
			String fileName = "C:\\Users\\Manav\\Desktop\\grid3.txt";
			File file = new File(fileName);
			System.out.println("grid1.txt");
			// Scanner input = new Scanner(System.in);
			Scanner read = new Scanner(file);
			System.out.println("File opened");
			do {
				for (int i = 1; i < 9; i++) {
					String line = read.nextLine();
					for (int j = 1; j < 9; j++) {
						myArray[i][j] = line.charAt(j - 1);
					}
					System.out.println(line);
				}
			} while (read.hasNext());
			read.close();
		} catch (Exception fnf) {
			System.out.println("FileNotFoundException");
			fnf.printStackTrace();
		}

		System.out.println("This is what I read: \n");
		/*
		 * for (int i = 0; i <= 9; i++) { for (int j = 0; j <= 9; j++) {
		 * System.out.print(myArray[i][j] + " "); } System.out.println(); }
		 */

		// displayGrid(myArray);

		return myArray;
	}// end of firstMethod

	public static void displayGrid(char[][] myArray) {
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(myArray[i][j]);
			}
			System.out.println();
		}
		// myArea(myArray, 1, 1, 0);
	}

	public static void area(char[][] myArray) {
		int n = 0;
		int num = 1;
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				if (myArray[i][j] == 'o')
					n++;
				if (i > 2)
					return;
			}
		}
	}

	public static void myArea(char[][] myArray, int i, int j, int n) {
		if (i < 3)
			if (myArray[i][j] == 'o') {
				myArea(myArray, i, j++, n++);
				if (j == 8)
					myArea(myArray, i++, j, n);
			} else
				return;
		else
			return;
		System.out.println("Area 1 = " + n);
	}

}
