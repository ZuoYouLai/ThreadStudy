package OneUnit.LikeServlet;

public class BLogin extends Thread{

	@Override
	public void run() {
		LoginServlet.dopost("b", "bb");
	}
	
}
