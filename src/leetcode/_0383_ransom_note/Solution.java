package leetcode._0383_ransom_note;

class Solution {

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] counts = new int[256];
		if (magazine.length() >= ransomNote.length()) {
			for (int i = 0; i < ransomNote.length(); i++) {
				counts[ransomNote.charAt(i)]++;
				counts[magazine.charAt(i)]--;
			}
			for (int i = ransomNote.length(); i <  magazine.length(); i++) {
				counts[magazine.charAt(i)]--;
			}
			for (int count : counts) {
				if (count > 0) {
					return Boolean.FALSE;
				}
			}
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}