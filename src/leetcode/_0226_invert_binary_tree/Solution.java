package leetcode._0226_invert_binary_tree;

public class Solution {

	public TreeNode invertTree(TreeNode root) {
		recursive(root);
		return root;
	}

	private void recursive(TreeNode node) {
		if (node != null) {
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;
			invertTree(node.left);
			invertTree(node.right);
		}
	}
}