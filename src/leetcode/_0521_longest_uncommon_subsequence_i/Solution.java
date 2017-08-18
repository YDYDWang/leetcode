package leetcode._0521_longest_uncommon_subsequence_i;

public class Solution {

	public int findLUSlength(String a, String b) {
		if ((a != null && !a.isEmpty()) || (b != null && !b.isEmpty())) {
			if (a.length() > b.length()) {
				return a.length();
			} else if (a.length() < b.length()) {
				return b.length();
			} else if (!a.equals(b)) {
				return a.length();
			}
		}
		return -1;
	}

}