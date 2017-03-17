package modelPattern.single;

public class FourSingle {
	private static FourSingle instance;
	private FourSingle(){}
	
	//˫�ؼ��ģʽ(DCL)
	//ԭ�򣺴����������̰߳�ȫ������
	//�ŵ㣺�̰߳�ȫ �ӳټ��� Ч�ʸ�
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
