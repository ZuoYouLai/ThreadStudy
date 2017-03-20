package OneUnit.Interrupt;

public class ierruptTest {
	
	public static void main(String[] args) {
		try {
			InterruptThread thread=new InterruptThread();
			thread.start();
			thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
