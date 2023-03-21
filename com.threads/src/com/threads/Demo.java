package com.threads;
class Sample implements Runnable{
	Sample(){
		Thread newThread=new Thread(this,"Remo");   //thread creation using runnable interfcae
		System.out.println("name of thread:"+newThread);
		newThread.start();
	
	}
	@Override
	public void run() {
		for(int i=0;i<8;i++) {
			System.out.println("sample"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("exit sample");
		
	}
	
}
public class Demo {
	public static void main(String[] args) {
		new Sample();
		for(int i=0;i<12;i++) {
			System.out.println("main thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

