package leetcode._0581_shortest_unsorted_continuous_subarray;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
	private static int[] nums;

	public static void main(String[] args) {
		nums = new int[] {2,6,4,8,10,9,15};
		System.out.println(new Solution().findUnsortedSubarray(nums));
		System.out.println(Arrays.toString(nums));
		nums = new int[] {2, 3, 3, 2, 4};
		System.out.println(new Solution().findUnsortedSubarray(nums));
		System.out.println(Arrays.toString(nums));
	}

}
