package OneUnit.ValueUse;

public class Mythread extends Thread{
	private int count=5;
	public Mythread(String name){
		super();
		this.setName(name);
	}
	@Override
	public void run() {
		while(count>0){
			System.out.println("Thread Name is:"+Thread.currentThread().getName()+" count is:"+count);
			count--;
		}
	}
	
}
