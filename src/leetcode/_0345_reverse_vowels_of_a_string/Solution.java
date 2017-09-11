package leetcode._0345_reverse_vowels_of_a_string;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {

	public String reverseVowels(String s) {
		char[] cs = new char[s.length()];
		Stack<Character> stack = new Stack<Character>();
		List<Integer> indexList = new LinkedList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case 'a':
					push(i, c, stack, indexList);
					break;
				case 'e':
					push(i, c, stack, indexList);
					break;
				case 'i':
					push(i, c, stack, indexList);
					break;
				case 'o':
					push(i, c, stack, indexList);
					break;
				case 'u':
					push(i, c, stack, indexList);
					break;
				case 'A':
					push(i, c, stack, indexList);
					break;
				case 'E':
					push(i, c, stack, indexList);
					break;
				case 'I':
					push(i, c, stack, indexList);
					break;
				case 'O':
					push(i, c, stack, indexList);
					break;
				case 'U':
					push(i, c, stack, indexList);
					break;
				default:
					cs[i] = c;
					break;
			}
		}
		for (int index : indexList) {
			cs[index] = stack.pop();
		}
		return String.valueOf(cs);
	}

	private void push(Integer index, char c, Stack<Character> stack, List<Integer> indexList) {
		indexList.add(index);
		stack.push(c);
	}
}