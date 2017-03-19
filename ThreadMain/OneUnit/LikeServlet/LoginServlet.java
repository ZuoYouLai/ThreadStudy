package OneUnit.LikeServlet;

//·ÂÕÕservlet·½·¨
public class LoginServlet {
	private static String usernameRef;
	private static String passwordRef;
	
	synchronized public static void dopost(String usname,String password){
		try {
			usernameRef=usname;
			if("a".equals(usname)){
				Thread.sleep(5000);
			}
			passwordRef=password;
			System.out.println("The username is :"+usname+" password is :"+password);
			} catch (Exception e) {
		}
	}
	
}
