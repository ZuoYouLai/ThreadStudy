
package OneUnit.yield;

public class Test {
	
	public static void main(String[] args) {
		Mythread thread=new Mythread();
		thread.start();
		
		//在run方法正常执行：则为执行很短的时间
		//在run方法当中进行加上Thread.yield 则执行很慢 【yield 空出cpu的资源 然后进行竞争】
	}

}
