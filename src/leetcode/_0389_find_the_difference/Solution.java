package leetcode._0389_find_the_difference;

class Solution {

	public char findTheDifference(String s, String t) {
		int[] sCounts = new int[26];
		int[] tCounts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			sCounts[s.charAt(i) - 97]++;
			tCounts[t.charAt(i) - 97]++;
		}
		tCounts[t.charAt(s.length()) - 97]++;
		for (int i = 0; i < sCounts.length; i++) {
			if (sCounts[i] != tCounts[i]) {
				return (char) (i + 97);
			}
		}
		return t.charAt(s.length());
	}

}