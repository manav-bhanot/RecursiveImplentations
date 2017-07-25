/**
 * 
 */
package edu.csulb.cecs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manav
 * 
 * Algorithm to print all valid (properly opened and closed)
 * combinations of n-pairs of parenthesis.
 *
 */
public class ParenthesisCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 3; // ((( )))jlll
		
		List<String> allP = new ArrayList<String>();
        generateParenthesisUtil(allP, n, n, "");
        
        for (String s : allP) {
        	System.out.println(s);
        }
	}
	
    private static void generateParenthesisUtil(List<String> allP, int lCount, int rCount, String str) {
        
        if (lCount == 0 && rCount == 0) {
            allP.add(str.toString());
            return;
        }
        
        // Check the number of leftParenthesis already added
        if (lCount > 0) {
            generateParenthesisUtil(allP, lCount - 1, rCount, str + "(");
        }
        
        if (lCount < rCount) {
            generateParenthesisUtil(allP, lCount, rCount - 1, str + ")");
        }
    }
	
	static boolean isValid(String s) {
		return s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')';
	}
}
