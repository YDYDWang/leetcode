package leetcode._0290_word_pattern;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public boolean wordPattern(String pattern, String str) {
		if (pattern == null || pattern.length() == 0
		   || str == null || str.length() == 0) {
			return Boolean.FALSE;
		}
		char[] patterns = pattern.toCharArray();
		char[] strs = str.toCharArray();
		Integer[] sums = new Integer[256];
		int indexP = 0;
		int sum = 0;
		for (char s : strs) {
			switch (s) {
				case ' ':
					if (indexP >= patterns.length) {
						return Boolean.FALSE;
					} 
					char p = patterns[indexP];
					if (sums[p] == null) {
						sums[p] = sum;
					} else {
						if (sums[p] != sum) {
							return Boolean.FALSE;
						}
					}
					sum = 0;
					indexP++;
					break;
				default:
					sum = sum << 1;
					sum += s;
					break;
			}
		}
		if (sum > 0) {
			if (indexP >= patterns.length) {
				return Boolean.FALSE;
			}
			char p = patterns[indexP];
			if (sums[p] == null) {
				sums[p] = sum;
			} else {
				if (sums[p] != sum) {
					return Boolean.FALSE;
				}
			}
			indexP++;
		}
		if (indexP < patterns.length) {
			return Boolean.FALSE;
		}
		Arrays.sort(sums, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				if (i1 == null && i2 == null) {
					return 0;
				}
				if (i1 == null) {
					return 1;
				}
				if (i2 == null) {
					return -1;
				}
				return i1.compareTo(i2);
		}});
		for (int i = 0; i < sums.length - 1; i++) {
			Integer current = sums[i];
			if (current == null || sums[i + 1] == null) {
				break;
			} else if (current.compareTo(sums[i + 1]) == 0) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}
}