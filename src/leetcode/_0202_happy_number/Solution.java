package leetcode._0202_happy_number;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public boolean isHappy(int n) {
		if (n < 0) {
			n = -n;
		}
		List<Integer> memoList = new ArrayList<Integer>();
		memoList.add(n);
		while (n != 1) {
			String string = Integer.toString(n);
			int result = 0;
			for (char c : string.toCharArray()) {
				int digit = Character.getNumericValue(c);
				result += square(digit);
			}
			n = result;
			if (memoList.contains(n)) {
				return Boolean.FALSE;
			}
			memoList.add(n);
		}
		return Boolean.TRUE;
	}

	private int square(int num) {
		switch (num) {
			case 1:
				return 1;
			case 2:
				return 4;
			case 3:
				return 9;
			case 4:
				return 16;
			case 5:
				return 25;
			case 6:
				return 36;
			case 7:
				return 49;
			case 8:
				return 64;
			case 9:
				return 81;
			default:
				return 0;
		}
	}
}