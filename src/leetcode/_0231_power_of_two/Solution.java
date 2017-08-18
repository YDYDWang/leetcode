package leetcode._0231_power_of_two;

public class Solution {

	public boolean isPowerOfTwo(int n) {
		if (n == 1) {
			return Boolean.TRUE;
		} else if (n > 1) {
			String binary = Integer.toBinaryString(n);
			int count = 0;
			for (char c : binary.toCharArray()) {
				if (c == '1') {
					count++;
				}
			}
			if (count == 1) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}