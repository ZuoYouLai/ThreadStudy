package modelPattern.single;

//饿汉式:可以看出其构造方法是私有方法内容,仅给提供一个doInstance方法进行实例化,效率的问题
public class TwoSingle {
	
	private static TwoSingle intance=new TwoSingle();
	private TwoSingle(){}
	
	public static TwoSingle doInstance(){
		return intance;
	}
}
