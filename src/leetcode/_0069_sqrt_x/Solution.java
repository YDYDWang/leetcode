package leetcode._0069_sqrt_x;

public class Solution {

	public int mySqrt(int x) {
		if (x < 2) {
			return x;
		}
		Integer temp = null;
		double y = 1;
		do {
			temp = (int) Math.floor(y);
			y = (y + x / y) / 2;
		} while (temp != Math.floor(y));
		if (temp * temp > x) {
			return temp - 1;
		}
		return temp;
	}

}