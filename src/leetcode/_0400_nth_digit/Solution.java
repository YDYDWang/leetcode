package leetcode._0400_nth_digit;

class Solution {

	public int findNthDigit(int n) {
		if (n >= 10) {
			int series = 1;
			int count = 1;
			while (Boolean.TRUE) {
				int temp = n;
				for (int i = 0; i < count; i++) {
					temp -= (series * 10 - series);
					if (temp < 0) {
						break;
					}
				}
				if (temp >= 0) {
					n = temp;
					count++;
					series *= 10;
				} else {
					int remain = n % count;
					if (remain > 0) {
						System.out.println(Integer.toString(n / count + series));
						return Integer.valueOf(Integer.toString(n / count + series).substring(remain - 1, remain));
					} else {
						System.out.println(Integer.toString(n / count + series - 1));
						String string = Integer.toString(n / count + series - 1);
						return Integer.valueOf(string.substring(string.length() - 1));
					}
				}
			}
		}
		return n;
	}

}