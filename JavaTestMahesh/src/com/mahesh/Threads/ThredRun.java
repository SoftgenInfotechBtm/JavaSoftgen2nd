package com.mahesh.Threads;

public class ThredRun implements Runnable{
	public static void main(String args[]){  
		ThredRun obj=new ThredRun(); 
		obj.run();
	     Thread tobj =new Thread(obj);  
	     tobj.start();  
	 }

	@Override
	public void run() {
		System.out.println("My thread is in running state."); 		
	}
}
