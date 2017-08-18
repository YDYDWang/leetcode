package leetcode._0009_palindrome_number;

public class Solution {

	public boolean isPalindrome(int x) {
		if (x >= 0) {
			char[] chars = Integer.valueOf(x).toString().toCharArray();
			int middleIndex = chars.length / 2;
			if (chars.length % 2 > 0) {
				for (int i = 1; i < middleIndex + 1; i++) {
					if (chars[middleIndex - i] != chars[middleIndex + i]) {
						return Boolean.FALSE;
					}
				}
			} else {
				for (int i = 1; i < middleIndex + 1; i++) {
					if (chars[middleIndex - i] != chars[middleIndex + i - 1]) {
						return Boolean.FALSE;
					}
				}
			}
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}