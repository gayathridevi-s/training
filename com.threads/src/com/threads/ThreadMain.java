package com.threads;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		// Thread t=Thread.currentThread(); -gives main thread
		Thread t = new Thread("firstThread"); // creating thread using Thread(String name)
		System.out.println("current thread " + t);
		t.setName("My Thread"); // changing name of thread
		System.out.println("new name " + t);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("main thread interupted");
				e.printStackTrace();
			}
		}
		Runnable name = new Runnable() { // anonymous class,no need of creating new class for interface implementation
											// for just one method
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("hello");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

			}
		};
		Thread myName = new Thread(name);

		ThreadInterface1 name1 = new ThreadInterface1(); // creating class that implements interface
		Thread myName1 = new Thread(name1); // create thread using Thread(Runnable r)

		Runnable name2 = () -> { // lambda expression for functional interface

			for (int i = 0; i < 10; i++) { // functional interface-only one abstract method
				System.out.println("welcome");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};
		Thread myName2 = new Thread(name2);
		Thread myName3 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("habibi");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}, "habibiii");
		myName2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("priority of myName2 is " + myName2.getPriority());
		myName.start();
		myName1.start();
		myName2.start();
		myName3.start();
		// myName.start(); cant start a thread twice, cause illegal thread state exception
		System.out.println("no of active threads" + Thread.activeCount()); // number of threads
		myName.setName("hi");
		System.out.println(myName3.getName());
		System.out.println("name of thread1 is " + myName.getName());

		myName.join();
		myName1.join();
		// myName2.join();
		System.out.println("bye bye"); // only after executing other threads,main thread will execute
	}
}
