package OneUnit.Interrupt;

public class Test {

	public static void main(String[] args) {
		try {
			Mythread threaMythread=new Mythread();
			threaMythread.start();
			threaMythread.sleep(1000);
			threaMythread.interrupt();  //��ӡ����false
//			Thread.currentThread().interrupt();  //��ӡ��true
			System.out.println("�߳��Ƿ�ֹͣ1?"+threaMythread.interrupted());
			System.out.println("�߳��Ƿ�ֹͣ2?"+threaMythread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main cath.");
			e.printStackTrace();
		}
		System.out.println("end method.");

	}
}
