package leetcode._0001_two_sum;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
		nums = new int[] {3, 2, 4};
		target = 6;
		System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
		nums = new int[] {3, 2, 3};
		target = 6;
		System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
	}

}
