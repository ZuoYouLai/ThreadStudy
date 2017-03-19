package OneUnit.LikeServlet;

public class ALogin extends Thread{

	@Override
	public void run() {
		LoginServlet.dopost("a", "aa");
	}
 
}
