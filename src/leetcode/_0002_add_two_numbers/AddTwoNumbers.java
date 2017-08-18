package leetcode._0002_add_two_numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbers {
	public static ListNode l1 = AddTwoNumbers.toListNode(2, 4, 3);
	public static ListNode l2 = AddTwoNumbers.toListNode(5, 6, 4);

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

	public static void main(String[] args) {
		ListNode node = new Solution().addTwoNumbers(l1, l2);
		System.out.print(node.val + " ");
		while ((node = node.next) != null) {
			System.out.print(node.val + " ");
		}
	}
}