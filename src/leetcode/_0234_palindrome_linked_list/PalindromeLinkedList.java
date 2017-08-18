package leetcode._0234_palindrome_linked_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(null));
		System.out.println(new Solution().isPalindrome(toListNode(1)));
		System.out.println(new Solution().isPalindrome(toListNode(1, 2, 1)));
		System.out.println(new Solution().isPalindrome(toListNode(1, 2, 3)));
		System.out.println(new Solution().isPalindrome(toListNode(1, 2, 3, 4, 5, 4, 3, 2, 1)));
		System.out.println(new Solution().isPalindrome(toListNode(1, 2, 3, 4, 4, 3, 2, 1)));
		System.out.println(new Solution().isPalindrome(toListNode(1, 2, 3, 4, 5, 3, 2, 1)));
	}

	public static ListNode toListNode(Integer... digits) {
		if (digits == null || digits.length == 0) {
			return null;
		}
		List<Integer> digitlist = Arrays.asList(digits);
		Collections.reverse(digitlist);
		ListNode listNode = new ListNode(digitlist.get(0));
		for (int i = 1; i < digitlist.size(); i++) {
			ListNode temp = listNode;
			listNode = new ListNode(digitlist.get(i));
			listNode.next = temp;
		}
		return listNode;
	}
}
