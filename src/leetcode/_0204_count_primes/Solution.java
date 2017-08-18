package leetcode._0204_count_primes;

public class Solution {

	public int countPrimes(int n) {
		if (n > 1) {
			int countPrimes = n - 2;
			boolean[] memo = new boolean[n];
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (memo[i] == Boolean.FALSE) {
					for (int j = i + i; j < n; j += i) {
						if (memo[j] == Boolean.FALSE) {
							memo[j] = Boolean.TRUE;
							countPrimes--;
						}
					}
				}
			}
			return countPrimes;
		}
		return 0;
	}

}