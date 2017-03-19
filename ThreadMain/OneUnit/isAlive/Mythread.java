package OneUnit.isAlive;

public class Mythread extends Thread{

	@Override
	public void run() {
		System.out.println("run alive is :"+Thread.currentThread().isAlive());
	}

	
}
