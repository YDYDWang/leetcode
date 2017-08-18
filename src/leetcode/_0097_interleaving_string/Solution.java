package leetcode._0097_interleaving_string;

public class Solution {

	public boolean isInterleave(String s1, String s2, String s3) {
		char[] siChars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		char[] s3Chars = s3.toCharArray();
		int s1CharIndex = 0;
		int s2CharIndex = 0;
		int s3CharIndex = 0;
		boolean[][] memo = new boolean[siChars.length+1][s2Chars.length+1];
		return this.isInterleave(siChars, s1CharIndex, s2Chars, s2CharIndex, s3Chars, s3CharIndex, memo);
	}

	public boolean isInterleave(char[] siChars, int s1CharIndex
			, char[] s2Chars, int s2CharIndex
			, char[] s3Chars, int s3CharIndex
			, boolean[][] memo) {
		if (s3CharIndex >= s3Chars.length) {
			if (s1CharIndex > siChars.length - 1 && s2CharIndex > s2Chars.length - 1) {
				return Boolean.TRUE;
			}
			return Boolean.FALSE;
		}
		if (memo[s1CharIndex][s2CharIndex] == Boolean.TRUE) {
			return Boolean.FALSE;
		}
		memo[s1CharIndex][s2CharIndex] = Boolean.TRUE;
		char s3Char = s3Chars[s3CharIndex];
		if (s1CharIndex <= siChars.length - 1 && s3Char == siChars[s1CharIndex]) {
			boolean isInterleave = Boolean.FALSE;
			if (s2CharIndex <= s2Chars.length - 1 && s3Char == s2Chars[s2CharIndex]) {
				isInterleave = isInterleave(siChars, s1CharIndex + 1, s2Chars, s2CharIndex, s3Chars, s3CharIndex + 1, memo);
				if (isInterleave == Boolean.FALSE) {
					return isInterleave(siChars, s1CharIndex, s2Chars, s2CharIndex + 1, s3Chars, s3CharIndex + 1, memo);
				} else {
					return Boolean.TRUE;
				}
			} else {
				return isInterleave(siChars, s1CharIndex + 1, s2Chars, s2CharIndex, s3Chars, s3CharIndex + 1, memo);
			}
		} else if (s2CharIndex <= s2Chars.length - 1 && s3Char == s2Chars[s2CharIndex]) {
			return isInterleave(siChars, s1CharIndex, s2Chars, s2CharIndex + 1, s3Chars, s3CharIndex + 1, memo);
		}
		return Boolean.FALSE;
	}
}