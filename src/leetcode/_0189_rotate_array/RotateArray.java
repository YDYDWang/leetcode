package leetcode._0189_rotate_array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] ints = new int[] {1};
		new Solution().rotate(ints, 0);
		System.out.println(Arrays.toString(ints));
		ints = new int[] {1, 2, 3, 4, 5, 6, 7};
		new Solution().rotate(ints, 1);
		System.out.println(Arrays.toString(ints));
		ints = new int[] {1, 2, 3, 4, 5, 6};
		new Solution().rotate(ints, 4);
		System.out.println(Arrays.toString(ints));
	}

}
