package OneUnit.Interrupt;

public class returnInterruptTest {
	public static void main(String[] args) throws InterruptedException {
		returnInterruptThread thread=new returnInterruptThread();
		thread.start();
		thread.sleep(1000);
		thread.interrupt();
		//��������try catch ��������Ϊ���쳣���ϴ��� ʹ�߳���ͣ�¼�����
		
	}

}
