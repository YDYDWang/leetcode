package leetcode._0645_set_mismatch;

public class Solution {
	public int[] findErrorNums(int[] nums) {
		int twice = 0;
		int[] counts = new int[nums.length + 1];
		for (int num : nums) {
			counts[num]++;
			if (counts[num] > 1) {
				twice = num;
			}
		}
		int missing = 0;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) {
				missing = i;
			}
		}
		return new int[] {twice, missing};
	}
}