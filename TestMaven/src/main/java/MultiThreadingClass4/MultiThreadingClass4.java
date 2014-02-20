package MultiThreadingClass4;

public class MultiThreadingClass4{

	private int count=1;
	
	private synchronized void increment()
	{
		System.out.println("Values of Count:"+count);
		count++;
	}

	public void startthreads(){
		
		Thread T1 = new Thread(new Runnable(){
			public void run(){
				
				for(int i=0; i<=100;i++){
					increment();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}		
			}	
		});
		
		Thread T2 = new Thread(new Runnable(){
			public void run(){
				
				for(int i=0; i<=100;i++){
					increment();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}		
			}	
		});
		
		T1.start();
		T2.start();
		
	}
	public MultiThreadingClass4() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingClass4 M4 = new MultiThreadingClass4();
		M4.startthreads();
	}
}
