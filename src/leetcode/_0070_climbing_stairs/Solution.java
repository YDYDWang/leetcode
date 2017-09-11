package leetcode._0070_climbing_stairs;

class Solution {
	public int climbStairs(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			int lastLastNum = 1;
			int lastNum = 2;
			while (n-- > 2) {
				int temp = lastNum;
				lastNum += lastLastNum;
				lastLastNum = temp;
			}
			return lastNum;
		}
	}
}