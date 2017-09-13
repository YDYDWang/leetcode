package leetcode._0160_intersection_of_two_linked_lists;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA = 0;
		int lengthB = 0;
		ListNode node = headA;
		while (node != null) {
			node = node.next;
			lengthA++;
		}
		node = headB;
		while (node != null) {
			node = node.next;
			lengthB++;
		}
		ListNode nodeA = headA;
		ListNode nodeB = headB;
		node = null;
		int length = lengthA;
		if (lengthA > lengthB) {
			length = lengthB;
			for (int i = 0; i < lengthA - lengthB; i++) {
				nodeA = nodeA.next;
			}
		} else if (lengthA < lengthB) {
			length = lengthA;
			for (int i = 0; i < lengthB - lengthA; i++) {
				nodeB = nodeB.next;
			}
		}
		for (int i = 0; i < length; i++) {
			if (nodeA.val == nodeB.val) {
				if (node == null) {
					node = nodeA;
				}
			} else {
				node = null;
			}
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}
		return node;
	}
}

