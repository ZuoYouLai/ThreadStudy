package OneUnit.RandomThread;

import java.util.Random;

public class Mythread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<50;i++){
			int randomNum=(int) (Math.random()*1000);
			try {
				System.out.println("Thread Name is:"+Thread.currentThread().getName()+" No-->"+i);
				Thread.currentThread().sleep(randomNum);
				System.out.println("child thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	

}
