package thread.test;

import thread.lock.DeadLock;

public class DeadLockTest {
	public static void main(String[] args) {
		DeadLock deadLock1=new DeadLock();
		DeadLock deadLock2=new DeadLock();
		deadLock1.flag=0;
		deadLock2.flag=1;
		final Thread t1=new Thread(deadLock1);
		final Thread t2=new Thread(deadLock2);
		
		t1.start();
		t2.start();
		
		//线程在等待获得锁的时候,你中断操作不能起作用，无法终止
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(2000);
					t1.interrupt();
					t2.interrupt();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}
}
