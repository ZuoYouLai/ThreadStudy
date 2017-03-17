package thread.lock;

public class DeadLock implements Runnable{
	public int flag=0;
	//static修饰保证不同的DeadLock对象也共享Object对象
	static final Object o1=new Object();
	static final Object o2=new Object();
	
	
	public void run() {
		String name=Thread.currentThread().getName();
		if(flag == 0){
			synchronized (o1) {
				System.out.println("1----------------Thread Name is"+name+",Object:o1 is lock..."+o1.hashCode());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
				}
				synchronized (o2) {
					System.out.println("1----------------Thread Name is"+name+",Object:o2 is lock..."+o2.hashCode());
				}
			}
		}else{
			synchronized (o2) {
				System.out.println("2----------------Thread Name is"+name+",Object:o2 is lock..."+o2.hashCode());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				synchronized (o1) {
					System.out.println("2----------------Thread Name is"+name+",Object:o1 is lock..."+o1.hashCode());
				}
			}
			
		}
	}
	
	public void work(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
