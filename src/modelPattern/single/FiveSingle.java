package modelPattern.single;


/**
 * ��̬�ڲ��� 
 * ���ַ�ʽ������ʽ��ʽ���õĻ������ƣ������в�ͬ�����߶��ǲ�������װ�صĻ�������֤��ʼ��ʵ��ʱֻ��һ���̡߳���ͬ�ĵط��ڶ���ʽ��ʽ��ֻҪSingleton�౻װ�ؾͻ�ʵ������
 * û��Lazy-Loading�����ã�����̬�ڲ��෽ʽ��Singleton�౻װ��ʱ����������ʵ��������������Ҫʵ����ʱ������getInstance�������Ż�װ��SingletonInstance�࣬�Ӷ����Singleton��ʵ������
 * ��ľ�̬����ֻ���ڵ�һ�μ������ʱ���ʼ�������������JVM�������Ǳ�֤���̵߳İ�ȫ�ԣ�������г�ʼ��ʱ������߳����޷�����ġ�
 * 
 * �ŵ㣺�ӳټ��� �̰߳�ȫ Ч�ʸ�
 */
public class FiveSingle {
	private FiveSingle(){}
	private static class SingleInstance{
		private final static FiveSingle Instance=new FiveSingle();
	}
	
	public static FiveSingle doInstance(){
		return SingleInstance.Instance;
	}

}
