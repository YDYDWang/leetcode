package leetcode._0104_maximum_depth_of_binary_tree; class Solution {

	public int maxDepth(TreeNode root) {
		return maxDepth(root, 0);
	}

	public int maxDepth(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		} else {
			int leftDepth = maxDepth(node.left, depth + 1);
			int rightDepth = maxDepth(node.right, depth + 1);
			return leftDepth > rightDepth ? leftDepth : rightDepth;
		}
	}
}