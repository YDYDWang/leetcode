package leetcode._0028_Implement_strStr;

class Solution {
	public int strStr(String haystack, String needle) {
		if (haystack.length() == 0 && haystack.length() == needle.length()) {
			return 0;
		}
		int needleTotal = 0;
		for (byte b : needle.getBytes()) {
			needleTotal += b;
		}
		int haystackTotal = 0;
		int firstIndex = 0;
		if (haystack.length() > 0 && haystack.length() >= needle.length()) {
			byte[] bytes = haystack.getBytes();
			for (int i = 0; i < needle.length(); i++) {
				haystackTotal += bytes[i];
			}
			if (haystackTotal == needleTotal && haystack.substring(0, needle.length()).equals(needle)) {
				return firstIndex;
			}
			for (int i = needle.length(); i < haystack.length(); i++) {
				haystackTotal += bytes[i] - bytes[firstIndex];
				firstIndex++;
				if (haystackTotal == needleTotal && haystack.substring(firstIndex, firstIndex + needle.length()).equals(needle)) {
					return firstIndex;
				}
			}
		}
		return -1;
	}
}