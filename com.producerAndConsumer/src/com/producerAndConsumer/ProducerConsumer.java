package com.producerAndConsumer;

import java.util.Queue;
import java.util.LinkedList;

public class ProducerConsumer {
	public static void main(String[] args) {
		Object key = new Object();
		Queue<Integer> queue=new LinkedList<Integer>();
		int size=10;
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				int count=0;
				
					synchronized (key) {
						while (queue.size()==size) {
							try {
								queue.wait();
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
						}
						
						queue.offer(count++);
					}
				}
			

		});
		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				
					synchronized (key) {
						while (queue.size()!=0) {
							queue.poll();
					}
						try {
							queue.wait();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
				}

			}

		});
		producer.start();
		consumer.start();
	}
}
