package leetcode._0219_contains_duplicate_ii;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		NumIndexVo[] vos = new NumIndexVo[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			vos[i] = new NumIndexVo(num, i);
		}
		Arrays.sort(vos, new Comparator<NumIndexVo>() {
			@Override
			public int compare(NumIndexVo vo1, NumIndexVo vo2) {
				return Integer.compare(vo1.val, vo2.val);
			}
		});
		for (int i = 0; i < vos.length - 1; i++) {
			NumIndexVo current = vos[i];
			NumIndexVo next = vos[i + 1];
			if (current.val == next.val && (next.index - current.index) <= k) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	private static class NumIndexVo {
		int val;
		int index;

		NumIndexVo(int val, int index) {
			this.val = val;
			this.index = index;
		}
	}
}
