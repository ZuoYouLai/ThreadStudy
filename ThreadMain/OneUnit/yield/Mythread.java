package OneUnit.yield;

public class Mythread extends Thread{

	@Override
	public void run() {
		super.run();
		Long begin=System.currentTimeMillis();
		int count=0;
		for(int i=0;i<1000000;i++){
			Thread.yield();
			count+=(i+1);
		}
		Long end=System.currentTimeMillis();
		System.out.println("Use Time is : "+(end-begin)+"s");
	}

	
}
