package thread;

public class forThread {
	
	private static boolean flag=false;
	
	public static void main(String[] args) {
		
		
		
		//先子线程10次,主线程20次
		new Thread(new Runnable() {
			public void run() {
					synchronized (forThread.class) {
						if(flag){
							try {
								forThread.class.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else{
							for(int i=0;i<10;i++){
								System.out.println(Thread.currentThread().getName()+"子线程运行第"+i+"次");
							}
							
						}
					}
			}
		}).start();
		
		
		
		
		
		
		
		
	}

}
