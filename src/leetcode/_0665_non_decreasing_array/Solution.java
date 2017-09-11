package leetcode._0665_non_decreasing_array;

class Solution {
	public boolean checkPossibility(int[] nums) {
		int count = 0;
		int length = nums.length - 1;
		for (int i = 0; i < length; i++) {
			if (nums[i] > nums[i + 1]) {
				if (i > 0 && nums[i - 1] > nums[i + 1]) {
					nums[i + 1] = nums[i];
				} else {
					nums[i] = nums[i + 1];
				}
				if (++count > 1 || (i > 0 && nums[i - 1] > nums[i + 1])) {
					return Boolean.FALSE;
				}
			}
		}
		return Boolean.TRUE;
	}
}