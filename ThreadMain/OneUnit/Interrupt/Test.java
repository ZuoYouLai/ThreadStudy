package OneUnit.Interrupt;

public class Test {

	public static void main(String[] args) {
		try {
			Mythread threaMythread=new Mythread();
			threaMythread.start();
			threaMythread.sleep(1000);
			threaMythread.interrupt();  //打印的是false
//			Thread.currentThread().interrupt();  //打印的true
			System.out.println("线程是否停止1?"+threaMythread.interrupted());
			System.out.println("线程是否停止2?"+threaMythread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main cath.");
			e.printStackTrace();
		}
		System.out.println("end method.");

	}
}
