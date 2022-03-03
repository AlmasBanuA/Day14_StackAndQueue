package day14.StackAndQueue;

public class StackMain {

	public static void main(String[] args) {

		/*
		 * PROCEDURE :
		 * 
		 * 1.creating an Oject of class Stack
		 * 2.Calling method to push value to stack
		 * 3.calling method to display value of stack
		 */

		/*
		 * 1.creating Object an Oject
		 */
		System.out.println("inserting element into stack ::");
		Stack stack = new Stack();
		
		 /*
		 * 2.Calling addnode method to push value to stack
		 */
		
		/*
		 * UC1:Ability to create a Stack of 56->30->70
		 */
			stack.addNode(70);
			stack.addNode(30);
			stack.addNode(56);

	}
}
