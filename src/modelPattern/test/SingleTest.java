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
			//ִ���߳�����
			thread.start();
		}
		
		//���������߳�ִ�����ִ�����߳�
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
		
		System.err.println("�߳�ִ��ʱ��Ϊ:"+(Time2-Time1)+"ms");
		
	}
	
	
	
	
	@Test
	public void testOneSingle(){
		//����ʽ:��������߳��ǲ���ȫ��
		doManyThread(1);
	}

	@Test
	public void testTwoSingle(){
		//����ʽ:��������߳��ǰ�ȫ��
		doManyThread(2);
	}
	
	@Test
	public void testThreeSingle(){
		//����ʽ:���������������  --->1.�����ڷ�����Ч������    2.�����������̲߳���ȫ����
		doManyThread(3);
	}
	
	@Test
	public void testFourSingle(){
		//����ʽ:���������������--->˫��У������
		doManyThread(4);
	}
	
	@Test
	public void testFiveSingle(){
		//���������������--->��̬�ڲ���
		doManyThread(5);
	}
	
}
