package OneUnit.Interrupt;

public class returnInterruptTest {
	public static void main(String[] args) throws InterruptedException {
		returnInterruptThread thread=new returnInterruptThread();
		thread.start();
		thread.sleep(1000);
		thread.interrupt();
		//不建议用try catch 方法，因为怕异常向上传递 使线程暂停事件传播
		
	}

}
