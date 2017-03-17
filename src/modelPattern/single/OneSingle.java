package modelPattern.single;

//懒汉式:线程不安全  效率有保证
public class OneSingle {
	
	private static OneSingle instance;
	private OneSingle(){}
	
	public static OneSingle doInstance(){
		if(null == instance){
			instance = new OneSingle();
		}
		return instance;
	}

}
