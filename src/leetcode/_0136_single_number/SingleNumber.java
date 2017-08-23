package leetcode._0136_single_number;

public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(new Solution().singleNumber(new int[] {0}));
		System.out.println(new Solution().singleNumber(new int[] {1, 1}));
		System.out.println(new Solution().singleNumber(new int[] {1, 2, 3, 4}));
		System.out.println(new Solution().singleNumber(new int[] {1, 1, 3, 4}));
		System.out.println(new Solution().singleNumber(new int[] {1, 1, 4, 4}));
		System.out.println(new Solution().singleNumber(new int[] {1, 2, 2, 3, 3}));
		System.out.println(new Solution().singleNumber(new int[] {1, 1, 4, 4, 5}));
	}

}
