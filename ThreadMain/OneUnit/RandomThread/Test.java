package OneUnit.RandomThread;

public class Test {
	
	public static void main(String[] args) {
		Mythread thMythread=new Mythread();
		thMythread.setName("MrLaiTHread");
		thMythread.start();
		for(int k=0;k<10;k++){
			int ran=(int) (Math.random()*1000);
			try {
				System.out.println("Thread Name is:"+Thread.currentThread().getName()+" No-->"+k);
				Thread.currentThread().sleep(ran);
				System.out.println("main thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
