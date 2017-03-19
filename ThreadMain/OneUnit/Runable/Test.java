package OneUnit.Runable;

public class Test {
	
	public static void main(String[] args) {
		MyRunable runable=new MyRunable();
		Thread thread=new Thread(runable);
		thread.start();
		System.out.println("run finish");
	}

}
