package OneUnit.isAlive;

public class Test {
	/**
	 * ����isAlive�̻߳״̬
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Mythread mythread=new Mythread();
		System.out.println("begin -->mythread in mian isAlive is : "+mythread.isAlive());
		mythread.start();
		Thread.sleep(1000);
		System.out.println("end -->mythread in mian isAlive is : "+mythread.isAlive());
		
		/**
		 * ִ�н��:
		 * begin -->mythread in mian isAlive is : false
		   end -->mythread in mian isAlive is : true
		   run alive is :true
		   
		     �����prinln��end�ϼ���thread.sleepִ�з�����alive��
		     begin -->mythread in mian isAlive is : false
			 run alive is :true
			 end -->mythread in mian isAlive is : false
		     
		 */
	}

}
