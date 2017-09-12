package leetcode._0532_K_Diff_Pairs_in_an_Array;

import java.util.Arrays;

class Solution {
	public int findPairs(int[] nums, int k) {
		if (k < 0) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 0;
		Integer tempa = null;
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			if (tempa != null && tempa == a) {
				continue;
			} else {
				tempa = a;
			}
			int bIndex = i + 1;
			Integer tempb = null;
			while (bIndex < nums.length) {
				int b = nums[bIndex];
				if (tempb != null && tempb == b) {
					bIndex++;
					continue;
				} else {
					tempb = b;
				}
				int distance = a - b;
				if (distance == k || distance == -k) {
					count++;
					break;
				} else {
					bIndex++;
				}
			}
		}
		return count;
	}
}