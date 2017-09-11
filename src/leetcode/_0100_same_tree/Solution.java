package leetcode._0100_same_tree;

class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p != null && q != null) {
			if (p.val == q.val) {
				if (isSameTree(p.left, q.left)) {
					return isSameTree(p.right, q.right);
				} else {
					return Boolean.FALSE;
				}
			} else {
				return Boolean.FALSE;
			}
		} else if (p == null && q == null) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
}