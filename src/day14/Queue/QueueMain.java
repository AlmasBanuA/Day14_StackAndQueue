package day14.StackAndQueue;

public class QueueMain {

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
			 * 1.creating an Oject
			 */

			System.out.println("Deleting element from queue ::");
			Queue queue = new Queue();

			/*
			 * Adding element to the queue
			 */
			queue.enqueue(56);
			queue.enqueue(30);
			queue.enqueue(70);
			queue.printList();

			/*
			 * deleting element from queue
			 */
			queue.dequeue();
			queue.printList();
		}
	}
