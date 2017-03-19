package OneUnit.ValueUse;

public class TwoThreadTest {
	
	public static void main(String[] args) {
		TwoThread two=new TwoThread();
		Thread t1=new Thread(two,"A");
		Thread t2=new Thread(two,"B");
		Thread t3=new Thread(two,"C");
		Thread t4=new Thread(two,"D");
		Thread t5=new Thread(two,"E");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		/**
		 * 执行的结果是：
		 *  Thread Name is :A count is:4
			Thread Name is :C count is:2
			Thread Name is :D count is:1
			Thread Name is :B count is:1
			Thread Name is :E count is:0
			
			变量虽然共享了，但是数值是不正确的，没有正确的减，非线程安全的;出现的问题是：count--其实拆分 
				count取原值
				count=count-1
				count进行赋值
				
			线程安全的问题要使其对于的方法进行加锁处理，使线程同步进行调用
				让public void run() 
				变为synchronized public void run()
			
			加锁后执行正确的
		 */
	}
	
}
