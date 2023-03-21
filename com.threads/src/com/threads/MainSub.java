package com.threads;

 public class MainSub  {   //main thread
	public static void main(String[] args) throws InterruptedException {
		SubThread s1=new SubThread();   //creating multiple threads
		SubThread s2=new SubThread();
		SubThread s3=new SubThread();
		s1.setName("thread1");
		s2.setName("thread2");
		s3.setName("thread3");
		System.out.println(s1.isAlive());   //checks wthether a thread is running
		s2.start();
		try {
			s2.join();    //completes its execution and then only allows other threads
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		System.out.println(s2.isAlive());
		//s1.run();				treat as normal methods,not threads,no context switching,no thread creation,executes in main thread
		//s2.run();
		s1.start();
		s1.join();
		s3.start();
		s3.join();
		for(int j=0;j<10;j++) {
			System.out.println("content of main thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
}
class SubThread extends Thread{	// thread creation using thread class
	
	public void run() {
		String name=Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}