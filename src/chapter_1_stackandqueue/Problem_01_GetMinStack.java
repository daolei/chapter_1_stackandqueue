package chapter_1_stackandqueue;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class Problem_01_GetMinStack {
	public static class MyStack1 {

		public Stack<Integer> stackData;
		public Stack<Integer> stackMin;

		public MyStack1() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		public void push(int data) {
			if (this.stackMin.isEmpty())
				stackMin.push(data);
			else if (this.stackMin.peek() < data)
				stackMin.push(this.stackMin.peek());
			this.stackData.push(data);
		}

		public int pop() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeErrorException(null, "your stack is empty");
			} else {
				this.stackMin.pop();
				return this.stackData.pop();
			}
		}

		public int getmin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeErrorException(null, "your stack is empty");
			} else {
				return this.stackMin.peek();
			}
		}
	}

	public static void main(String[] args) {
		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		System.out.println(stack1.getmin());
		stack1.push(4);
		System.out.println(stack1.getmin());
		stack1.push(1);
		System.out.println(stack1.getmin());
		System.out.println(stack1.pop());
		System.out.println(stack1.getmin());

		System.out.println("=============");

		MyStack1 stack2 = new MyStack1();
		stack2.push(3);
		System.out.println(stack2.getmin());
		stack2.push(4);
		System.out.println(stack2.getmin());
		stack2.push(1);
		System.out.println(stack2.getmin());
		System.out.println(stack2.pop());
		System.out.println(stack2.getmin());
	}

}
