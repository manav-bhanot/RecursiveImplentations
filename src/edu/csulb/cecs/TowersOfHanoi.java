/**
 * 
 */
package edu.csulb.cecs;

import java.util.Scanner;

/**
 * Problem source : hackerrank
 * @author Manav :: Problem statement - There are 3 towers T1, T2, T3. T1
 *         contains N disks of different sizes which can slide onto any tower.
 *         The puzzle starts with the disks in a neat stack in ascending order
 *         of size on T1, the smallest disk at the top, thus making a conical
 *         shape.
 * 
 *         The objective of the puzzle is to move the entire stack to T3,
 *         obeying the following simple rules:
 * 
 *         Only one disk can be moved at a time.
 * 
 *         Each move consists of taking the upper disk from one of the towers
 *         and placing it on top of another i.e. a disk can only be moved if it
 *         is the uppermost disk on a tower.
 * 
 *         No larger disk can be placed on top of a smaller disk.
 * 
 *         The task is, given a value (N) print the steps to be performed to
 *         obtain the required arrangement.
 * 
 *         Each step of your output must be as shown below:
 * 
 *         MOVE Ti Tj
 * 
 *         INPUT
 * 
 *         A number N
 * 
 *         OUTPUT
 * 
 *         The moves to accomplish the task.
 * 
 *         SAMPLE
 * 
 *         INPUT
 * 
 *         2
 * 
 *         OUTPUT
 * 
 *         MOVE T1 T2
 * 
 *         MOVE T1 T3
 * 
 *         MOVE T2 T3
 * 
 *         CONSTRAINTS
 * 
 *         1 <= N <= 10
 *
 */
public class TowersOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = scan.nextInt();
		
		// The goal is to move the entire tower from src=1 to dest=2
		MoveTowers(n, 1, 2, 3);
	}
	
	/**
	 * n = number of disks
	 * src = source tower
	 * dest = destination tower
	 * tmp = tmp tower (used as a helper to move the disks around
	 * 
	 * @param n
	 * @param src
	 * @param dest
	 * @param tmp
	 */
	static void MoveTowers(int n, int src, int dest, int tmp) {
		if (n > 0) {
			MoveTowers(n-1, src, tmp, dest);
			MoveSingleDisk(src, dest);
			MoveTowers(n-1, tmp, dest, src);
		}
	}

	private static void MoveSingleDisk(int src, int dest) {
		System.out.println("MOVE T" + src + " T" + dest);
		
	}
}
