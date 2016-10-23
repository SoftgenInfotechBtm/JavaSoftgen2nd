package com.mahesh.Threads;

public class ThreadTwiceExample implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " is executing.");

	}

	public static void main(String args[]) {
		Thread th1 = new Thread(new ThreadTwiceExample(), "th1");
		Thread th2 = new Thread(new ThreadTwiceExample(), "th2");
		th1.start();
//		th2.start();
//		th2.run();
		th1.run();
		th1.run();
	}
}
