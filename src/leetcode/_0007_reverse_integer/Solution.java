package leetcode._0007_reverse_integer;

public class Solution {

	public int reverse(int x) {
		byte[] bytes = Integer.toString(x).getBytes();
		if (bytes[0] == 0x2d) {
			int length = bytes.length;
			byte[] returnBytes = new byte[length];
			returnBytes[0] = 0x2d;
			for (int i = 1; i < bytes.length; i++) {
				returnBytes[i] = bytes[--length];
			}
			if (isValid(returnBytes)) {
				return Integer.valueOf(new String(returnBytes));
			}
		} else {
			int length = bytes.length;
			byte[] returnBytes = new byte[length];
			for (int i = 0; i < bytes.length; i++) {
				returnBytes[i] = bytes[--length];
			}
			if (isValid(returnBytes)) {
				return Integer.valueOf(new String(returnBytes));
			}
		}
		return 0;
	}

	private boolean isValid(byte[] bytes) {
		if (bytes[0] == 0x2d && bytes.length == 11) {
			byte[] compare = Integer.toString(Integer.MIN_VALUE).getBytes();
			for (int i = 1; i < 11; i++) {
				if (compare[i] > bytes[i]) {
					return Boolean.TRUE;
				} else if (bytes[i] > compare[i]) {
					return Boolean.FALSE;
				}
			}
		} else if (bytes.length == 10) {
			byte[] compare = Integer.toString(Integer.MAX_VALUE).getBytes();
			for (int i = 0; i < 10; i++) {
				if (compare[i] > bytes[i]) {
					return Boolean.TRUE;
				} else if (bytes[i] > compare[i]) {
					return Boolean.FALSE;
				}
			}
		}
		return Boolean.TRUE;
	}

}