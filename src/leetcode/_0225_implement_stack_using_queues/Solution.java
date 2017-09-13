package leetcode._0225_implement_stack_using_queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	private final Queue<Integer> queue;

	/** Initialize your data structure here. */
	public MyStack() {
		this.queue = new LinkedList<Integer>();
	}
	
	/** Push element x onto stack. */
	public void push(int x) {
		queue.add(x);
	}
	
	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		Iterator<Integer> iterator = queue.iterator();
		Integer val = null;
		while (iterator.hasNext()) {
			val = iterator.next();
		}
		if (val != null) {
			iterator.remove();
			return val;
		}
		return 0;
	}
	
	/** Get the top element. */
	public int top() {
		Iterator<Integer> iterator = queue.iterator();
		Integer val = null;
		while (iterator.hasNext()) {
			val = iterator.next();
		}
		if (val != null) {
			return val;
		}
		return 0;
	}
	
	/** Returns whether the stack is empty. */
	public boolean empty() {
		if (queue.size() == 0) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */