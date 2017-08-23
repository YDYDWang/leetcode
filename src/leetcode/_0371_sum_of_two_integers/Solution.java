package leetcode._0371_sum_of_two_integers;

class Solution {

	public int getSum(int a, int b) {
		while (a != 0) {
			int and = (a & b) << 1;
			b ^= a ;
			a = and;
		}
		return b;
	}

}