package leetcode._0155_min_stack;

import java.util.LinkedList;

class MinStack {
	private final LinkedList<Node> list;
	private int minimum;

	/** initialize your data structure here. */
	public MinStack() {
		list = new LinkedList<Node>();
		minimum = Integer.MAX_VALUE;
	}
	
	public void push(int x) {
		list.addFirst(new Node(x , minimum));
		if (x < minimum) {
			minimum = x;
		}
	}
	
	public void pop() {
		Node node = list.getFirst();
		if (node.x == minimum) {
		   minimum = node.minimum;
		}
		list.removeFirst();
	}
	
	public int top() {
		return list.getFirst().x;
	}
	
	public int getMin() {
		return minimum;
	}
}

class Node {
	int x;
	int minimum;

	Node(int x, int minimum) {
		this.x = x;
		this.minimum = minimum;
	}
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */