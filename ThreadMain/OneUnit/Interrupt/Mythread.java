package OneUnit.Interrupt;

public class Mythread extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<100;i++){
			System.out.println("Number is:"+(i+1));
		}
	}
	
	
}
