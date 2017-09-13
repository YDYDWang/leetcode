package leetcode._0160_intersection_of_two_linked_lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionofTwoLinkedLists {
	public static ListNode headA = IntersectionofTwoLinkedLists.toListNode(1, 2, 3, 4, 5, 6, 7);
	public static ListNode headB = IntersectionofTwoLinkedLists.toListNode(1, 2, 3, 4, 5, 6, 7);

	public static void main(String[] args) {
		new Solution().getIntersectionNode(headA, headB);
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
