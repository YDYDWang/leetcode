package leetcode._0234_palindrome_linked_list;

import java.util.Stack;

public class Solution {

	public boolean isPalindrome(ListNode node) {
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode temp = node;
		while (temp != null) {
			stack.add(temp);
			temp = temp.next;
		}
		int size = stack.size() / 2;
		while (--size >= 0) {
			if (node.val != stack.pop().val) {
				return Boolean.FALSE;
			}
			node = node.next;
		}
		return Boolean.TRUE;
	}

}
