package leetcode._0014_longest_common_prefix;

public class Solution {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length > 0) {
			String first = strs[0];
			if (strs.length > 1) {
				char[] chars = first.toCharArray();
				loop : for (int i = 0; i < chars.length; i++) {
					for (int j = 1; j < strs.length; j++) {
						String str = strs[j];
						if (i == str.length()) {
							if (i > 0) {
								return first.substring(0, i);
							} else if (i == 0) {
								return "";
							}
							break loop;
						} else {
							if (chars[i] != str.charAt(i)) {
								if (i > 0) {
									return first.substring(0, i);
								} else if (i == 0) {
									return "";
								}
								break loop;
							}
						}
					}
				}
				return first;
			} else {
				return first;
			}
		}
		return "";
	}

}