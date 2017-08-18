package leetcode._0015_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> tripletsList = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 2; i++) {
			int a = nums[i];
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int bIndex = i + 1;
			int cIndex = nums.length - 1;
			while (bIndex < cIndex) {
				int b = nums[bIndex];
				if (bIndex > i + 1 && nums[bIndex] == nums[bIndex - 1]) {
					bIndex++;
					continue;
				}
				int c = nums[cIndex];
				if (cIndex < nums.length - 1 && nums[cIndex] == nums[cIndex + 1]) {
					cIndex--;
					continue;
				}
				int sum = a + b + c;
				if (sum == 0) {
					tripletsList.add(Arrays.asList(a, b, c));
					cIndex--;
				} else if (sum > 0) {
					cIndex--;
				} else {
					bIndex++;
				}
			}
		}
		return tripletsList;
	}

}