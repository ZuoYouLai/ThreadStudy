package OneUnit.Interrupt;

public class InterruptThread extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<20000;i++){
			if(this.interrupted()){
				System.out.println("�߳��Ѿ�ִ���ж�...��������ִ��");
				break;
			}
			System.out.println("Num is:"+(i+1));
		}
		System.out.println("����߳�ִ���ж�ִ������˵��û���жϣ���Ȼ����ִ��");
	}
	
	

}
