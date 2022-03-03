package day14.StackAndQueue;

public class StackMain {

	public static void main(String[] args) {
		/**
		 * Main method for manipulation Queue Operation
		 * 
		 * @param args - Default Java param (Not used)
		 */

		/**
		 * PROCEDURE
		 * 1.creating Object 
		 * 2.Calling method to add value at first
		 * 3.calling method to display value of queue
		 */

		/*
		 * 1.creating Object an Oject
		 */
		Queue queue = new Queue();
		/*
		 * 2.Calling method to add
		 */
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);

		/*
		 * 3.calling method to display value of Queue
		 */
		queue.printList();
	}

}