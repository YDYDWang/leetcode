package leetcode._0168_excel_sheet_column_title;

import java.util.LinkedList;

public class Solution {

	public String convertToTitle(int n) {
		if (n < 1) {
			return "";
		}
		LinkedList<Character> list = new LinkedList<Character>();
		int d = 1;
		while (n > 0) {
			int num = n / d % 26;
			if (num == 0) {
				list.addFirst((char) (num + 26 + 64));
				n -= (num + 26) * d;
			} else {
				list.addFirst((char) (num + 64));
				n -= num * d;
			}
			d *= 26;
		}
		char[] chars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			chars[i] = list.get(i);
		}
		return String.valueOf(chars);
	}

}