package leetcode._0581_shortest_unsorted_continuous_subarray;

class Solution {
	public int findUnsortedSubarray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		Integer min = null;
		Integer max = null;
		int i = 0;
		for (; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1] && (min == null || nums[i + 1] < min)) {
				min = nums[i + 1];
			}
		}
		for (int j = nums.length - 1; j >= 1; j--) {
			if (nums[j] < nums[j - 1] && (max == null || nums[j - 1] > max)) {
				max = nums[j - 1];
			}
		}
		if (max == min) {
			return 0;
		}
		int from = -1;
		int to = -1;
		for (i = 0; i < nums.length - 1; i++) {
			if (nums[i] > min) {
				from = i;
				break;
			}
		}
		for (int j = nums.length - 1; j >= 0; j--) {
			if (nums[j] < max) {
				to = j;
				break;
			}
		}
		return to - from + 1;
	}
}