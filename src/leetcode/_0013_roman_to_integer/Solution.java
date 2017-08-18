package leetcode._0013_roman_to_integer;

public class Solution {

	public int romanToInt(String s) {
		int number = 0;
		char[] chars = s.toCharArray();
		Integer lastNumber = null;
		for (char c : chars) {
			int currentNumber = romanToInt(c);
			if (lastNumber == null) {
				lastNumber = currentNumber;
			} else {
				if (currentNumber > lastNumber) {
					number += currentNumber - lastNumber;
					lastNumber = null;
				} else {
					number += lastNumber;
					lastNumber = currentNumber;
				}
			}
		}
		if (lastNumber != null) {
			number += lastNumber;
		}
		return number;
	}

	private int romanToInt(char c) {
		switch (c) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
			}
	}
}