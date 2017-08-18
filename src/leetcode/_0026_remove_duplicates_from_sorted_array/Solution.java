package leetcode._0026_remove_duplicates_from_sorted_array; class Solution {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int index = 0;
		int lastNum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (lastNum != nums[i]) {
				lastNum = nums[i];
				index++;
			}
			nums[index] = nums[i];
		}
		return index + 1;
	}

}