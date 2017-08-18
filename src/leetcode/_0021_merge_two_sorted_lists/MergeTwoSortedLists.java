package leetcode._0021_merge_two_sorted_lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
	public static ListNode l1 = MergeTwoSortedLists.toListNode(5);
	public static ListNode l2 = MergeTwoSortedLists.toListNode(1, 2, 4);

	public static void main(String[] args) {
		MergeTwoSortedLists.println(new Solution().mergeTwoLists(l1, l2));
		MergeTwoSortedLists.println(new Solution().mergeTwoLists(MergeTwoSortedLists.toListNode(-10, -10, -9, -4, 1, 6, 6)
				, MergeTwoSortedLists.toListNode(-7)));
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

	public static void println(ListNode listNode) {
		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
		System.out.println();
	}
}
