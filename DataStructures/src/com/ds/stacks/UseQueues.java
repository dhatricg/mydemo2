package com.ds.stacks;

import com.cg.queues.Queues;

public class UseQueues {

	public static void main(String[] args) {
		Queues queue = new Queues(5);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.remove();
		queue.insert(5);
		//queue.insert(6);
		queue.display();
		//queue.display();
		
		

		
		// TODO Auto-generated method stub

	}

}
