package leetcode._0303_range_sum_query_immutable;

class NumArray {
	private int[] memo;

	public NumArray(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		memo = nums;
	}

	public int sumRange(int i, int j) {
		if (j >= 0 && i <= j && i < memo.length) {
			j = Math.min(memo.length - 1, j);
			if (i > 0) {
				return memo[j] - memo[i - 1];
			} else {
				return memo[j];
			}
		}
		return 0;
	}
}