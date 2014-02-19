package com.TestMaven;

public class MultiThreadingClass implements Runnable {

	public MultiThreadingClass() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++)
		{
			System.out.println("Printing Count"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread X1 = new Thread(new MultiThreadingClass());
			Thread X2 = new Thread(new MultiThreadingClass());
			X1.start();
			X2.start();
	}
}
