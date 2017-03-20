package OneUnit.Interrupt;

public class returnInterruptThread extends Thread{

	/**
	 * 使用interrupt与return方法进行中断线程
	 */
	@Override
	public void run() {
		super.run();
		while(true){
			if(this.interrupted()){
				System.out.println("thread is interrupt。。。。。");
				return;
			}
			System.out.println("Time is :"+System.currentTimeMillis());
		}
	}
	
	
	

}
