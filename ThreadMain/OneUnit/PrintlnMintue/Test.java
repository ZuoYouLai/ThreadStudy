package OneUnit.PrintlnMintue;

public class Test {
	/**
	 * ���̹߳��������println��count--������
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
		 * ִ�еĽ���ǣ�
		 *  Thread Name is : A count value is:5
			Thread Name is : D count value is:3
			Thread Name is : E count value is:4
			Thread Name is : B count value is:2
			Thread Name is : C count value is:1
			���̰߳�ȫ
			1.��ȫ��Ҫ���ڣ�System.out.println("Thread Name is : "+Thread.currentThread().getName()+" count value is:"+(count--));
			2.println�������̰߳�ȫ��
			3.����count--���̱߳����ǲ���ȫ�ģ����Ե��¹�������������
			�޸ĵĵط�Ϊ��public void run()
			Ϊ��synchronized public void run()
		*/
	}
}
