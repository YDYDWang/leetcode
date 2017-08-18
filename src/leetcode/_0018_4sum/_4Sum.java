package leetcode._0018_4sum;

import java.io.IOException;

public class _4Sum {

	public static void main(String[] args) throws IOException {
		System.out.println(new Solution().fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0));
		System.out.println(new Solution().fourSum(new int[] {0, 0, 0, 0}, 0));
		System.out.println(new Solution().fourSum(new int[] {3,1,4,2,5,-4,2,4,-5}, -12));
		System.out.println(new Solution().fourSum(new int[] {-3,-1,0,2,4,5}, 1));
	}

}
