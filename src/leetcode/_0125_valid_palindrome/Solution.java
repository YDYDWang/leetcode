package leetcode._0125_valid_palindrome;

class Solution {

	public boolean isPalindrome(String s) {
		int forwardIndex = 0;
		int backwardIndex = s.length() - 1;
		Byte forwardByte = null;
		boolean isForward = Boolean.TRUE;
		byte[] bytes = s.getBytes();
		while (forwardIndex <= backwardIndex) {
			if (isForward) {
				byte b = bytes[forwardIndex];
				if (b >= 97 && b <= 122) {
					forwardByte = (byte) (b - 32);
					isForward = Boolean.FALSE;
				} else if ((b >= 65 && b <= 90) || (b >= 48 && b <= 57)) {
					forwardByte = b;
					isForward = Boolean.FALSE;
				}
				forwardIndex++;
			} else {
				byte b = bytes[backwardIndex];
				if (b >= 97 && b <= 122) {
					if (forwardByte != (b - 32)) {
						return Boolean.FALSE;
					}
					isForward = Boolean.TRUE;
				} else if ((b >= 65 && b <= 90) || (b >= 48 && b <= 57)) {
					if (forwardByte != b) {
						return Boolean.FALSE;
					}
					isForward = Boolean.TRUE;
				}
				backwardIndex--;
			}
		}
		return Boolean.TRUE;
	}

}