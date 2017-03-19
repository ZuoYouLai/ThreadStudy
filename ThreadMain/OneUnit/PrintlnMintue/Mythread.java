package OneUnit.PrintlnMintue;

public class Mythread extends Thread{
	private int count=5;

	@Override
	synchronized public void run() {
		System.out.println("Thread Name is : "+Thread.currentThread().getName()+" count value is:"+(count--));
	}
	 

}
