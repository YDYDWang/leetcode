package leetcode._0088_merge_sorted_array;

class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] nums = new int[nums1.length];
		int index1 = 1;
		int index2 = 0;
		int writeIndex = 0;
		int comare = nums1[0];
		boolean compareToS1 = Boolean.FALSE;
		if (m == 0) {
			comare = nums2[0];
			compareToS1 = Boolean.TRUE;
			index2 = 1;
		}
		while (index1 < m && index2 < n) {
			if (compareToS1) {
				int num = nums1[index1];
				if (comare < num) {
					nums[writeIndex] = comare;
					comare = num;
					compareToS1 = Boolean.FALSE;
				} else {
					nums[writeIndex] = num;
				}
				index1++;
			} else {
				int num = nums2[index2];
				if (comare < num) {
					nums[writeIndex] = comare;
					comare = num;
					compareToS1 = Boolean.TRUE;
				} else {
					nums[writeIndex] = num;
				}
				index2++;
			}
			writeIndex++;
		}
		if (index1 < m) {
			while (index1 < m) {
				int num = nums1[index1];
				if (comare < num) {
					nums[writeIndex] = comare;
					comare = num;
				} else {
					nums[writeIndex] = num;
				}
				writeIndex++;
				index1++;
			}
		} else {
			while (index2 < n) {
				int num = nums2[index2];
				if (comare < num) {
					nums[writeIndex] = comare;
					comare = num;
				} else {
					nums[writeIndex] = num;
				}
				writeIndex++;
				index2++;
			}
		}
		if (writeIndex < nums.length) {
			nums[writeIndex] = comare;
		}
		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];
		}
	}
}