package OneUnit.isAlive;

public class Test {
	/**
	 * 测试isAlive线程活动状态
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Mythread mythread=new Mythread();
		System.out.println("begin -->mythread in mian isAlive is : "+mythread.isAlive());
		mythread.start();
		Thread.sleep(1000);
		System.out.println("end -->mythread in mian isAlive is : "+mythread.isAlive());
		
		/**
		 * 执行结果:
		 * begin -->mythread in mian isAlive is : false
		   end -->mythread in mian isAlive is : true
		   run alive is :true
		   
		     如果在prinln的end上加上thread.sleep执行方法看alive：
		     begin -->mythread in mian isAlive is : false
			 run alive is :true
			 end -->mythread in mian isAlive is : false
		     
		 */
	}

}
