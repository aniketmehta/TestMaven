package MultiThreadingClass1;

public class MultiThreadingClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread X1 = new Thread(new Runnable(){
			
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
		});
		
		X1.start();
	}
}
