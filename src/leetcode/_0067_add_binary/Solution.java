package leetcode._0067_add_binary;

class Solution {
	public String addBinary(String a, String b) {
		if (a.length() >= b.length()) {
			char[] chars = new char[a.length()];
			int lengthA = a.length();
			int lengthB = b.length();
			boolean needCarry = Boolean.FALSE;
			for (int i = b.length() - 1; i >= 0; i--) {
				char ca = a.charAt(--lengthA);
				char cb = b.charAt(--lengthB);
				if (ca == cb) {
					if (ca == '1') {
						if (needCarry) {
							chars[lengthA] = '1';
						} else {
							chars[lengthA] = '0';
							needCarry = Boolean.TRUE;
						}
					} else {
						if (needCarry) {
							chars[lengthA] = '1';
							needCarry = Boolean.FALSE;
						} else {
							chars[lengthA] = '0';
						}
					}
				} else {
					if (needCarry) {
						chars[lengthA] = '0';
					} else {
						chars[lengthA] = '1';
					}
				}
			}
			for (int i = a.length() - 1; i >= b.length(); i--) {
				char ca = a.charAt(--lengthA);
				if (ca == '1') {
					if (needCarry) {
						chars[lengthA] = '0';
					} else {
						chars[lengthA] = '1';
					}
				} else {
					 if (needCarry) {
						chars[lengthA] = '1';
						needCarry = Boolean.FALSE;
					 } else {
						chars[lengthA] = '0';
					}
				}
			}
			if (needCarry) {
				return "1" + String.valueOf(chars);
			} else {
				return String.valueOf(chars);
			}
		} else {
			return addBinary(b, a);
		}
	}
}