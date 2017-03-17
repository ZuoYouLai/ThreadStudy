package modelPattern.single;

public class FourSingle {
	private static FourSingle instance;
	private FourSingle(){}
	
	//双重检查模式(DCL)
	//原因：代码块加锁有线程安全的问题
	//优点：线程安全 延迟加载 效率高
	public static FourSingle doInstance(){
		if(null == instance){
			synchronized (FourSingle.class) {
				if(null == instance){
					instance=new FourSingle();
				}
			}
		}
		return instance;
	}

}
