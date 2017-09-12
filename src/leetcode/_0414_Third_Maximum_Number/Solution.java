package leetcode._0414_Third_Maximum_Number;

class Solution {
	public int thirdMax(int[] nums) {
		Integer a = null;
		Integer b = null;
		Integer c = null;
		int i = 0;
		for (; i < nums.length; i++) {
			int num = nums[i];
			if (a == null) {
				a = num;
			} else if (num > a) {
				c = b;
				b = a;
				a = num;
			} else if (num < a) {
				if (b == null) {
					b = num;
				} else if (num > b) {
					c = b;
					b = num;
					break;
				} else if (num < b) {
					c = num;
					break;
				}
			}
			if (c != null) {
				break;
			}
		}
		for (; i < nums.length; i++) {
			int num = nums[i];
			if (a != num && b != num && c != num) {
				if (num > a) {
					c = b;
					b = a;
					a = num;
				} else if (num > b) {
					c = b;
					b = num;
				} else if (num > c) {
					c = num;
				}
			}
		}
		if (c == null) {
			return a;
		}
		return c;
	}
}