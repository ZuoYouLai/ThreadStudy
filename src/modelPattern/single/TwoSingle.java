package modelPattern.single;

//����ʽ:���Կ����乹�췽����˽�з�������,�����ṩһ��doInstance��������ʵ����,Ч�ʵ�����
public class TwoSingle {
	
	private static TwoSingle intance=new TwoSingle();
	private TwoSingle(){}
	
	public static TwoSingle doInstance(){
		return intance;
	}
}
