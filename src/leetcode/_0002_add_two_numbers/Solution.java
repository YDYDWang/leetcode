package leetcode._0002_add_two_numbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp = l1;
		int sum = l1.val + l2.val;
		int cary = 0;
		if (sum >= 10) {
			cary = 1;
			l1.val = sum % 10;
		} else {
			l1.val = sum;
		} 
		while ((l2 = l2.next) != null) {
			if (l1.next != null) {
				l1 = l1.next;
				sum = l1.val + l2.val + cary;
				if (sum >= 10) {
					cary = 1;
					l1.val = sum % 10;
				} else {
					cary = 0;
					l1.val = sum;
				} 
			} else if (cary == 1) {
				sum = l2.val + cary;
				if (sum >= 10) {
					cary = 1;
					l1.next = new ListNode(sum % 10);
				} else {
					cary = 0;
					l1.next = new ListNode(sum);
				} 
				l1 = l1.next;
			} else {
				l1.next = l2;
				break;
			}
		}
		while (cary == 1) {
			if (l1.next != null) {
				l1 = l1.next;
				sum = l1.val + cary;
				if (sum >= 10) {
					cary = 1;
					l1.val = sum % 10;
				} else {
					cary = 0;
					l1.val = sum;
				} 
			} else {
				cary = 0;
				l1.next = new ListNode(1);
			}
		}
		return temp;
	}
}