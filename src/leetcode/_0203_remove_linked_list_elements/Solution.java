package leetcode._0203_remove_linked_list_elements;

class Solution {
	public ListNode removeElements(ListNode head, int val) {
		ListNode node = null;
		ListNode previous = null;
		while (head != null) {
			if (head.val != val) {
				node = head;
				previous = head;
				break;
			}
			head = head.next;
		}
		while (head != null) {
			if (head.val == val) {
				previous.next = head.next;
			} else {
				previous = head;
			}
			head = head.next;
		}
		return node;
	}
}