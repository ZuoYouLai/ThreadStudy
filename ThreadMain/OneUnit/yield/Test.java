
package OneUnit.yield;

public class Test {
	
	public static void main(String[] args) {
		Mythread thread=new Mythread();
		thread.start();
		
		//��run��������ִ�У���Ϊִ�к̵ܶ�ʱ��
		//��run�������н��м���Thread.yield ��ִ�к��� ��yield �ճ�cpu����Դ Ȼ����о�����
	}

}
