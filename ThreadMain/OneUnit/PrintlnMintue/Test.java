package OneUnit.PrintlnMintue;

public class Test {
	/**
	 * 多线程共享变量且println与count--的问题
	 */
	public static void main(String[] args) {
		Mythread thMythread=new Mythread();
		Thread t1=new Thread(thMythread,"A");
		Thread t2=new Thread(thMythread,"B");
		Thread t3=new Thread(thMythread,"C");
		Thread t4=new Thread(thMythread,"D");
		Thread t5=new Thread(thMythread,"E");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		/**
		 * 执行的结果是：
		 *  Thread Name is : A count value is:5
			Thread Name is : D count value is:3
			Thread Name is : E count value is:4
			Thread Name is : B count value is:2
			Thread Name is : C count value is:1
			非线程安全
			1.安全的要点在：System.out.println("Thread Name is : "+Thread.currentThread().getName()+" count value is:"+(count--));
			2.println方法是线程安全的
			3.但是count--在线程本身是不安全的，所以导致共享数字有问题
			修改的地方为：public void run()
			为：synchronized public void run()
		*/
	}
}
