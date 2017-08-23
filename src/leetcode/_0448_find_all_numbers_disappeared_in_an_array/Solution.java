package leetcode._0448_find_all_numbers_disappeared_in_an_array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list = new LinkedList<Integer>();
		int nextNum = 1;
		for (int num : nums) {
			if (num > nextNum) {
				for (int i = nextNum; i < num; i++) {
					list.add(i);
				}
				nextNum = num + 1;
			} else if (num == nextNum) {
				nextNum++;
			}
		}
		for (int i = nextNum; i <= nums.length; i++) {
			list.add(i);
		}
		return list;
	}

}