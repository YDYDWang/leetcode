package leetcode._0461_hamming_distance;

class Solution {
	public int hammingDistance(int x, int y) {
		int z = (x | y) - (x & y);
		String binaryString = Integer.toBinaryString(z);
		int count = 0;
		for (char c : binaryString.toCharArray()) {
			switch (c) {
				case '1':
					count++;
					break;
			}
		}
		return count;
	}
}