package leetcode._0050_pow_x_n;

public class Solution {

	public double myPow(double x, int n) {
		double result = 1D;
		int count = 0;
		if (n > 0) {
			String binary = Integer.toBinaryString(n);
			for (int i = 0; i < binary.length(); i++) {
				char c = binary.charAt(binary.length() - i - 1);
				if (c == '1') {
					result *= x;
					count += i + 1;
					if (count == n) {
						break;
					}
				}
				x *= x;
			}
		} else if (n < 0) {
			x = 1 / x;
			String binary = Integer.toBinaryString(-n);
			for (int i = 0; i < binary.length(); i++) {
				char c = binary.charAt(binary.length() - i - 1);
				if (c == '1') {
					result *= x;
					count += i + 1;
					if (count - 1 == -n) {
						break;
					}
				}
				x *= x;
			}
		}
		return result;
	}

}
