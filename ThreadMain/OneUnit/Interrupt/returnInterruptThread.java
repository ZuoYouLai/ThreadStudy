package OneUnit.Interrupt;

public class returnInterruptThread extends Thread{

	/**
	 * ʹ��interrupt��return���������ж��߳�
	 */
	@Override
	public void run() {
		super.run();
		while(true){
			if(this.interrupted()){
				System.out.println("thread is interrupt����������");
				return;
			}
			System.out.println("Time is :"+System.currentTimeMillis());
		}
	}
	
	
	

}
