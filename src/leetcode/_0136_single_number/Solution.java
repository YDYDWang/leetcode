package leetcode._0136_single_number;

import java.util.Arrays;

class Solution {

	public int singleNumber(int[] nums) {
		int singleNumber = 0;
		Arrays.sort(nums);
		int i = 0;
		for (; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				i++;
			} else {
				singleNumber += nums[i];
			}
		}
		if (i < nums.length) {
			singleNumber += nums[i];
		}
		return singleNumber;
	}

}