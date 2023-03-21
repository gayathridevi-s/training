package com.threads;

public class ThreadInterface1 implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hai");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
