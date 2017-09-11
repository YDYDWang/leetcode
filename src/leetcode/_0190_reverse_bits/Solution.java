package leetcode._0190_reverse_bits;

public class Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		String unsigndString = Integer.toUnsignedString(n, 2);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = unsigndString.length() - 1; i >= 0; i--) {
			stringBuilder.append(unsigndString.charAt(i));
		}
		int newInt = Integer.parseUnsignedInt(stringBuilder.toString(), 2);
		int shift = 32 - unsigndString.length();
		if (shift > 0) {
			newInt = newInt << shift;
		}
		return newInt;
	}
}