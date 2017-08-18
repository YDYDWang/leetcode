package leetcode._0104_maximum_depth_of_binary_tree; class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		System.out.println(new Solution().maxDepth(null));
		TreeNode treeNode = new TreeNode(1);
		treeNode.right = new TreeNode(2);
		System.out.println(new Solution().maxDepth(treeNode));
	}

}
