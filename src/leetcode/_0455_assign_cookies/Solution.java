package leetcode._0455_assign_cookies;

import java.util.Arrays;

class Solution {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		int sIndex = 0;
		for (int gi : g) {
			if (sIndex == s.length) {
				break;
			} else {
				for (; sIndex < s.length; sIndex++) {
					if (s[sIndex] >= gi) {
						count++;
						sIndex++;
						break;
					}
				}
			}
		}
		return count;
	}
}