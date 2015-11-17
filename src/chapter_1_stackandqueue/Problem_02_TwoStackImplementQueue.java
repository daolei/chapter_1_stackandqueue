package chapter_1_stackandqueue;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class Problem_02_TwoStackImplementQueue {
	public class Queue{
		Stack<Integer> stack1;
		Stack<Integer> stack2;
		Queue(){
			this.stack1 = new Stack<Integer>();
			this.stack2 = new Stack<Integer>();
		}
		public void add(int data){
			if (stack1.isEmpty())
				stack1.push(data);
			else {
				while(!stack1.isEmpty()){
					stack2.push(stack1.pop());
				}
				stack1.push(data);
				while(!stack2.isEmpty())
					stack1.push(stack2.pop());
			}
		}
		public int poll(){
			if (stack1.isEmpty())
				throw new  RuntimeErrorException(null,"your queue is empty");
			else 
				return stack1.pop();
		}
		
		
		public int peek(){
			return stack1.peek();
		}
	}
	public static void main(String[] args){
		System.out.println("heh");
	}
	
}
