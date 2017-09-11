package leetcode._0066_plus_one;

class Solution {
	public int[] plusOne(int[] digits) {
		boolean needCarry = Boolean.TRUE;
		int[] newDigits = new int[digits.length];
		for (int i = digits.length - 1; i >= 0; i--) {
			int digit = digits[i];
			if (needCarry) {
				if (digit == 9) {
					newDigits[i] = 0;
				} else {
					newDigits[i] = digit + 1;
					needCarry = Boolean.FALSE;
				}
			} else {
				newDigits[i] = digit;
			}
		}
		if (needCarry) {
			int[] newNewDigits = new int[digits.length + 1];
			newNewDigits[0] = 1;
			for (int i = 1; i < newDigits.length; i++) {
				newNewDigits[i] = newDigits[i];
			}
			return newNewDigits;
		}
		return newDigits;
	}
}