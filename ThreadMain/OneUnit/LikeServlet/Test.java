package OneUnit.LikeServlet;

public class Test {

		public static void main(String[] args) {
			ALogin aLogin=new ALogin();
			aLogin.start();
			BLogin bLogin=new BLogin();
			bLogin.start();
			
			/**
			 * 一开始的执行结果为：
			 * 	The username is :b password is :bb
				The username is :b password is :aa
				
			      非线程安全的问题：
			      把public static void dopost(String usname,String password)
			      改为synchronized public static void dopost(String usname,String password)
			     执行的结果:    
			     The username is :a password is :aa
				 The username is :b password is :bb     
			 */
		}
}
