package leetcode._0026_remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int [] ints = new int[0];
		System.out.println(new Solution().removeDuplicates(ints));
		System.out.println(Arrays.toString(ints));
		ints = new int[] {1, 1, 2};
		System.out.println(new Solution().removeDuplicates(ints));
		System.out.println(Arrays.toString(ints));
		ints = new int[] {1, 1, 2, 2};
		System.out.println(new Solution().removeDuplicates(ints));
		System.out.println(Arrays.toString(ints));
		ints = new int[] {1, 1, 2, 2, 3};
		System.out.println(new Solution().removeDuplicates(ints));
		System.out.println(Arrays.toString(ints));
		ints = new int[] {1, 1, 2, 2, 4};
		System.out.println(new Solution().removeDuplicates(ints));
		System.out.println(Arrays.toString(ints));
	}

}
