package leetcode._0038_count_and_say;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public String countAndSay(int n) {
		if (n <= 1) {
			return "1";
		}
		List<Integer> list = Arrays.asList(1);
		while (--n > 0) {
			List<Integer> tempList = new ArrayList<Integer>();
			Integer lastNum = null;
			int count = 0;
			for (int num : list) {
				if (lastNum != null) {
					if (lastNum != num) {
						tempList.add(count);
						tempList.add(lastNum);
						lastNum = num;
						count = 1;
					} else {
						count++;
					}
				} else {
					lastNum = num;
					count = 1;
				}
			}
			list = tempList;
			tempList.add(count);
			tempList.add(lastNum);
		}
		StringBuffer stringBuffer = new StringBuffer();
		for (int num : list) {
			stringBuffer.append(num);
		}
		return stringBuffer.toString();
	}

}