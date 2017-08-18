package leetcode._0018_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			int a = nums[i];
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length - 2; j++) {
				int b = nums[j];
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int cIndex = j + 1;
				int dIndex = nums.length - 1;
				while (cIndex < dIndex) {
					int c = nums[cIndex];
					if (cIndex >  j + 1 && nums[cIndex] == nums[cIndex - 1]) {
						cIndex++;
						continue;
					}
					int d = nums[dIndex];
					if (dIndex <  nums.length - 1 && nums[dIndex] == nums[dIndex + 1]) {
						dIndex--;
						continue;
					}
					if (a + b + c + d == target) {
						list.add(Arrays.asList(a, b, c, d));
						cIndex++;
					} else if (a + b + c + d > target) {
						dIndex--;
					} else {
						cIndex++;
					}
				}
			}
		}
		return list;
	}

}