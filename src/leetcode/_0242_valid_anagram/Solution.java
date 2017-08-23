package leetcode._0242_valid_anagram;

class Solution {

	public boolean isAnagram(String s, String t) {
		if (s.length() == t.length()) {
			int[] sCounts = new int[26];
			int[] tCounts = new int[26];
			for (int i = 0; i < s.length(); i++) {
				sCounts[s.charAt(i) - 97]++;
				tCounts[t.charAt(i) - 97]++;
			}
			for (int i = 0; i < sCounts.length; i++) {
				if (sCounts[i] != tCounts[i]) {
					return Boolean.FALSE;
				}
			}
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}
