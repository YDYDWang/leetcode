package leetcode._0477_total_hamming_distance;

class Solution {
	public int totalHammingDistance(int[] nums) {
		int total = 0;
		int compare = 1073741824;
		for (int j = 0; j < 31; j++) {
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				int num = nums[i];
				if ((num & compare) > 0) {
					nums[i] ^= compare;
					count++;
				}
			}
			total += count * (nums.length - count);
			compare = compare >> 1;
		}
		return total;
	}

}