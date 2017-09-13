package leetcode._0088_merge_sorted_array;

import java.util.Arrays;

public class MergeSortedArray {
	private static int[] nums1;
	private static int[] nums2;

	public static void main(String[] args) {
		nums1 = new int[] {1, 2, 3, 0, 0, 0};
		nums2 = new int[] {2, 5, 6};
		new Solution().merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
		nums1 = new int[] {4, 5, 6, 0, 0, 0};
		nums2 = new int[] {1, 2, 3};
		new Solution().merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
		nums1 = new int[] {0,0,3,0,0,0,0,0,0};
		nums2 = new int[] {-1,1,1,1,2,3};
		new Solution().merge(nums1, 3, nums2, 6);
		System.out.println(Arrays.toString(nums1));
		nums1 = new int[] {-1,0,1,1,0,0,0,0,0};
		nums2 = new int[] {-1,0,2,2,3};
		new Solution().merge(nums1, 4, nums2, 5);
		System.out.println(Arrays.toString(nums1));
		nums1 = new int[] {-1,0,0,0,3,0,0,0,0,0,0};
		nums2 = new int[] {-1,-1,0,0,1,2};
		new Solution().merge(nums1, 5, nums2, 6);
		System.out.println(Arrays.toString(nums1));
		nums1 = new int[] {0};
		nums2 = new int[] {1};
		new Solution().merge(nums1, 0, nums2, 1);
		System.out.println(Arrays.toString(nums1));
	}

}
