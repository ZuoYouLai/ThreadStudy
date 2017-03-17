package modelPattern.single;

public class ThreeSingle {
	
	private static ThreeSingle instance;
	private ThreeSingle(){}
	
	//��������
	/**
	 *�߳���if( null == instance)��instance = new ThreeSingle()ִ��˳����ֵ�����
	 *1.ֱ���ڷ������м��� synchronized��Ч�������д���֤��
	 *	public static synchronized ThreeSingle doInstance()
	 *
	 *2.���д����Ľ��м�������,�����߳��ǲ���ȫ�ģ�����ʵ������������ :�����߳�B��ִ�У��߳�B��������߳�Bִ����֮���߳�A����������Ǵ�ʱû�м��singleton�Ƿ�Ϊ�վ�ֱ��ִ���ˣ����Ի����������singletonʵ�������������˫�ؼ��ģʽ��DCL���ͳ�����
	 */
	public static ThreeSingle doInstance(){
		if( null == instance){
			synchronized (ThreeSingle.class) {
				instance = new ThreeSingle();
			}
		}
		return instance;
	}
	

}
