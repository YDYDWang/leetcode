package leetcode._0020_valid_parentheses;

import java.util.Stack;

public class Solution {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case ')':
					if (stack.isEmpty()) {
						return Boolean.FALSE;
					} else {
						char leftBracket = stack.pop();
						if (leftBracket != '(') {
							return Boolean.FALSE;
						}
					}
					break;
				case ']':
					if (stack.isEmpty()) {
						return Boolean.FALSE;
					} else {
						char leftBracket = stack.pop();
						if (leftBracket != '[') {
							return Boolean.FALSE;
						}
					}
					break;
				case '}':
					if (stack.isEmpty()) {
						return Boolean.FALSE;
					} else {
						char leftBracket = stack.pop();
						if (leftBracket != '{') {
							return Boolean.FALSE;
						}
					}
					break;
				default:
					stack.push(c);
					break;
				}
		}
		if (stack.isEmpty()) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}