package com.dca.assignment;

import java.util.HashMap;
import java.util.Map;
/*
 * 1128. Number of Equivalent Domino Pairs
Easy

324

167

Add to List

Share
Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.

Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].

 

Example 1:

Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
 

Constraints:

1 <= dominoes.length <= 40000
1 <= dominoes[i][j] <= 9
 */
public class DominoPairs {
	 public int numEquivDominoPairs(int[][] dominoes) {
		 
			Map<Integer, Integer> map = new HashMap<>();
			int res = 0;
			for (int i = 0; i < dominoes.length; i++) {
				int[] domino = dominoes[i]; //2,1  ->> 21   //1,2  ->> 21  31
				int num = Math.max(domino[0], domino[1]) * 10 + Math.min(domino[0], domino[1]);
				int currCount = map.getOrDefault(num, 0);
				res = res + currCount;
				map.put(num, currCount + 1);   //21--> 1 //21-->2

			}
			return res;
	    }
	 public static void main(String[] args) {
	}
}
