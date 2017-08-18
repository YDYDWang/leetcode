package leetcode._0205_isomorphic_strings;

public class Solution {

	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return Boolean.FALSE;
		} else if (s.length() == 0 || s.length() == 1) {
			return Boolean.TRUE;
		} else {
			Byte[] sMemo = new Byte[256];
			Byte[] tMemo = new Byte[256];
			byte[] sBytes = s.getBytes();
			byte[] tBytes = t.getBytes();
			for (int i = 0; i < sBytes.length; i++) {
				byte bByte = sBytes[i];
				if (sMemo[bByte] == null) {
					byte tByte = tBytes[i];
					if (tMemo[tByte] == null) {
						sMemo[bByte] = tByte;
						tMemo[tByte] = bByte;
					} else if (tMemo[tByte] != sBytes[i]) {
						return Boolean.FALSE;
					}
				} else if (sMemo[bByte] != tBytes[i]) {
					return Boolean.FALSE;
				}
			}
			return Boolean.TRUE;
		}
	}

}