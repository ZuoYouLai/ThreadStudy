package OneUnit.LikeServlet;

public class Test {

		public static void main(String[] args) {
			ALogin aLogin=new ALogin();
			aLogin.start();
			BLogin bLogin=new BLogin();
			bLogin.start();
			
			/**
			 * һ��ʼ��ִ�н��Ϊ��
			 * 	The username is :b password is :bb
				The username is :b password is :aa
				
			      ���̰߳�ȫ�����⣺
			      ��public static void dopost(String usname,String password)
			      ��Ϊsynchronized public static void dopost(String usname,String password)
			     ִ�еĽ��:    
			     The username is :a password is :aa
				 The username is :b password is :bb     
			 */
		}
}
