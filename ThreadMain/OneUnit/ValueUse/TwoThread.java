package OneUnit.ValueUse;

public class TwoThread extends Thread{
	private int count=5;

	@Override
	synchronized public void run() {
		count--;
		System.out.println("Thread Name is :"+Thread.currentThread().getName()+" count is:"+count);
	}
	
	
	
}
