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
		 * ִ�еĽ���ǣ�
		 *  Thread Name is :A count is:4
			Thread Name is :C count is:2
			Thread Name is :D count is:1
			Thread Name is :B count is:1
			Thread Name is :E count is:0
			
			������Ȼ�����ˣ�������ֵ�ǲ���ȷ�ģ�û����ȷ�ļ������̰߳�ȫ��;���ֵ������ǣ�count--��ʵ��� 
				countȡԭֵ
				count=count-1
				count���и�ֵ
				
			�̰߳�ȫ������Ҫʹ����ڵķ������м�������ʹ�߳�ͬ�����е���
				��public void run() 
				��Ϊsynchronized public void run()
			
			������ִ����ȷ��
		 */
	}
	
}
