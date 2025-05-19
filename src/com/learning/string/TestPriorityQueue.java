package com.learning.string;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Character> priorityQueue=new  PriorityQueue<Character>();
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.peek());
	}
}
