package OneUnit.ValueUse;

public class Mythreadest {

		public static void main(String[] args) {
			//�̶߳Ա�����ʹ��,����or������
			Mythread m1=new Mythread("A");
			Mythread m2=new Mythread("B");
			Mythread m3=new Mythread("C");
			m1.start();
			m2.start();
			m3.start();
			/**
			 * ִ�еĽ���Ǹ���ִ�и��Եı�������ֵ������û�й���
			 */
		}
}
