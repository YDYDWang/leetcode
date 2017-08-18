package leetcode._0021_merge_two_sorted_lists;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			mergeTwoLists(l1, l2, l1, l2, Boolean.FALSE);
			return l1;
		} else {
			mergeTwoLists(l2, l1, l2, l1, Boolean.TRUE);
			return l2;
		}
	}

	public void mergeTwoLists(ListNode l1, ListNode l2, ListNode listNode, ListNode compare
			, boolean compareIsL1) {
		ListNode tmp = null;
		while ((tmp = listNode.next) != null) {
			if (compare.val < tmp.val) {
				listNode.next = compare;
				compare = tmp;
				if (compareIsL1) {
					compareIsL1 = Boolean.FALSE;
				} else {
					compareIsL1 = Boolean.TRUE;
				}
			} else {
				listNode = tmp;
			}
		}
		listNode.next = compare;
	}
}