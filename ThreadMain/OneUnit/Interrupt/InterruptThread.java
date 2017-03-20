package OneUnit.Interrupt;

public class InterruptThread extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<20000;i++){
			if(this.interrupted()){
				System.out.println("线程已经执行中断...不会往下执行");
				break;
			}
			System.out.println("Num is:"+(i+1));
		}
		System.out.println("如果线程执行中断执行了我说明没有中断，依然往下执行");
	}
	
	

}
