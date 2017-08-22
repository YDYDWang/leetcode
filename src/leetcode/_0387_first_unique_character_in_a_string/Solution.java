package leetcode._0387_first_unique_character_in_a_string;

class Solution {

	public int firstUniqChar(String s) {
		Integer[] counts = new Integer[26];
		Integer[] indexs = new Integer[26];
		int writeIndex = -1;
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 97;
			if (counts[index] == null) {
				counts[index] = i;
				indexs[++writeIndex] = index;
			} else if (counts[index] >= 0) {
				counts[index] = -1;
			}
		}
		for (int i = 0; i < indexs.length; i++) {
			if (indexs[i] != null && counts[indexs[i]] >= 0) {
				return counts[indexs[i]];
			}
		}
		return -1;
	}

}