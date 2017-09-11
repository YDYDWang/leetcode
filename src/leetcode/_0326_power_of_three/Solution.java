package leetcode._0326_power_of_three;

class Solution {
	public boolean isPowerOfThree(int n) {
		return n > 0 && 1162261467 % n == 0;
	}
}