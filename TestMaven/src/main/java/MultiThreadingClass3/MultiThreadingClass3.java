package MultiThreadingClass3;

import java.util.Scanner;

public class MultiThreadingClass3 extends Thread {

	private volatile boolean running = true;
	
	public void run(){
		
		while(running ){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	}
	
	
	public MultiThreadingClass3() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingClass3 M1 = new MultiThreadingClass3();
		M1.start();
		
		Scanner s1= new Scanner(System.in);
		s1.nextLine();
		
		M1.shutdown();
	}


	private void shutdown() {
		// TODO Auto-generated method stub
		running =false;
	}

}
