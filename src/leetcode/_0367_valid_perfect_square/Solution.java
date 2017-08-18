package leetcode._0367_valid_perfect_square;

public class Solution {

	public boolean isPerfectSquare(int num) {
		if (num < 1) {
			return Boolean.FALSE;
		}
		double x = 1;
		Integer result = null;
		do {
			result = (int) Math.floor(x);
			x = (x + num / x) / 2;
		} while (Math.floor(x) != result);
		if (result * result == num) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}
