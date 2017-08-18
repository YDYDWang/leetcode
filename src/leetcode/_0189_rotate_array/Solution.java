package leetcode._0189_rotate_array;

public class Solution {

	public void rotate(int[] nums, int k) {
		k %= nums.length;
		if (nums.length > 0 && k > 0) {
			int i = -1;
			int count = 0;
			while (count < nums.length) {
				int index = ++i;
				int temp = nums[index];
				do {
					int a = temp;
					index = (index + k) % nums.length;
					temp = nums[index];
					nums[index] = a;
					count++;
				} while (index != i);
			}
		}
	}

}