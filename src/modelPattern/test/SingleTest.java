package modelPattern.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import modelPattern.single.FiveSingle;
import modelPattern.single.FourSingle;
import modelPattern.single.OneSingle;
import modelPattern.single.ThreeSingle;
import modelPattern.single.TwoSingle;

import org.junit.Test;

public class SingleTest {
	
	
	public void doManyThread(final int flag){
		Vector<Thread> threadList=new Vector<Thread>();
		final Map<String,Object> map=new HashMap<String,Object>();
		Long Time1=System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			Thread thread=new Thread(new Runnable() {
				public void run() {
					Object obj=new Object();
					switch (flag) {
						case 1:
							OneSingle single=OneSingle.doInstance();	
							obj=single;
							break;
						default:
						case 2:
							TwoSingle twosingle=TwoSingle.doInstance();	
							obj=twosingle;
							break;
						case 3:
							ThreeSingle threeSingle=ThreeSingle.doInstance();	
							obj=threeSingle;
							break;
						case 4:
							FourSingle fourSingle=FourSingle.doInstance();	
							obj=fourSingle;
							break;
						case 5:
							FiveSingle fiveSingle=FiveSingle.doInstance();	
							obj=fiveSingle;
							break;
					}
					String name=Thread.currentThread().getName();
					System.out.println("Thread Name--->"+name+"  hasCode:"+obj.hashCode());
					map.put(obj.hashCode()+"", obj);
				}
			});
			threadList.add(thread);
			//执行线程内容
			thread.start();
		}
		
		//进行让子线程执行完才执行主线程
		for(Thread thread:threadList){
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Long Time2=System.currentTimeMillis();
		for(Map.Entry<String, Object> entry:map.entrySet()){
			System.err.println(entry.getKey());
		}
		
		System.err.println("线程执行时间为:"+(Time2-Time1)+"ms");
		
	}
	
	
	
	
	@Test
	public void testOneSingle(){
		//懒汉式:结果表明线程是不安全的
		doManyThread(1);
	}

	@Test
	public void testTwoSingle(){
		//饿汉式:结果表明线程是安全的
		doManyThread(2);
	}
	
	@Test
	public void testThreeSingle(){
		//懒汉式:结果表明加锁操作  --->1.加锁在方法上效率问题    2.代码块加锁有线程不安全问题
		doManyThread(3);
	}
	
	@Test
	public void testFourSingle(){
		//懒汉式:结果表明加锁操作--->双重校验问题
		doManyThread(4);
	}
	
	@Test
	public void testFiveSingle(){
		//结果表明加锁操作--->静态内部类
		doManyThread(5);
	}
	
}
