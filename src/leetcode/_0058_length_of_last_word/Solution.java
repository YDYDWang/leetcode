package leetcode._0058_length_of_last_word;

public class Solution {

	public int lengthOfLastWord(String s) {
		int length = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			switch (s.charAt(i)) {
				case ' ':
					if (length > 0) {
						return length;
					}
					break;
				default:
					length++;
					break;
				}
		}
		return length;
	}

}