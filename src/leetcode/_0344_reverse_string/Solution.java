package leetcode._0344_reverse_string;

public class Solution {

	public String reverseString(String s) {
		char[] chars = s.toCharArray();
		int length = chars.length;
		char[] tempChars = new char[length];
		for (int i = 0; i < chars.length; i++) {
			tempChars[i] = chars[--length];
		}
		return String.valueOf(tempChars);
	}
}
