package OneUnit.ValueUse;

public class Mythreadest {

		public static void main(String[] args) {
			//线程对变量的使用,共享or不共享
			Mythread m1=new Mythread("A");
			Mythread m2=new Mythread("B");
			Mythread m3=new Mythread("C");
			m1.start();
			m2.start();
			m3.start();
			/**
			 * 执行的结果是各自执行各自的变量内容值：变量没有共享
			 */
		}
}
