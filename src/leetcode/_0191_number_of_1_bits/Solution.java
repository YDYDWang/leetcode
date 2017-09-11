package leetcode._0191_number_of_1_bits;

public class Solution {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		String unsignedString = Integer.toUnsignedString(n, 2);
		int count = 0;
		for (int i = 0; i < unsignedString.length(); i++) {
			if (unsignedString.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
}