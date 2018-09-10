package com.shawnmuktadir;

public class Runner {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(11);
		queue.enQueue(12);
		queue.enQueue(13);
		
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		
		queue.enQueue(100);
		queue.enQueue(110);
		queue.enQueue(120);
		queue.enQueue(120);
		
		System.out.println("Size is: "+queue.getSize());
		
		System.out.println("Empty Queue is: "+queue.isEmpty());
		System.out.println("Full Queue is: "+queue.isFull());
		
		queue.show();

	}

}
