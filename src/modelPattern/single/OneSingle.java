package modelPattern.single;

//����ʽ:�̲߳���ȫ  Ч���б�֤
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
