package leetcode._0347_top_k_frequent_elements;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<Integer> topKFrequent(int[] nums, int k) {
		int min = 0;
		int max = 0;
		for (int num : nums) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		int length = nums.length + 1;
		if (max >= length) {
			length = max + 1;
		}
		int[] numsCount = new int[length];
		int[] numsCountsCount = new int[length];
		Integer[] fixIndexs = new Integer[length];
		int[] counts = new int[length];
		Integer[] topK = new Integer[k];
		for (int num : nums) {
			numsCount[num - min]++;
		}
		for (int numCount : numsCount) {
			if (numCount != 0) {
				numsCountsCount[numCount]++;
			}
		}
		int count = 0;
		for (int i = numsCountsCount.length - 1; i >= 0; i--) {
			if (count < k) {
				if (numsCountsCount[i] > 0) {
					fixIndexs[i] = count;
					counts[i] = count;
					count += numsCountsCount[i];
				}
			} else {
				break;
			}
		}
		for (int i = 0; i < numsCount.length; i++) {
			int numCount = numsCount[i];
			if (numCount > 0 && fixIndexs[numCount] != null) {
				int index = fixIndexs[numCount] + fixIndexs[numCount] - counts[numCount];
				topK[index] = i + min;
				counts[numCount]--;
			}
		}
		return Arrays.asList(topK);
	}

}