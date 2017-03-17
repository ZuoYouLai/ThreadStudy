package buildObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.junit.Test;

public class ObjTest {
	
	
	
	@Test
	public void testOne(){
		//��һ�ִ�����ʽ:new
		person p=new person();
		p.setAge(12);
		p.setName("one person.");
		System.out.println(p.toString());
	}
	
	
	@Test
	public void testTwo() throws Exception{
		//�ڶ��֣�class����ȡ
		Class cls=Class.forName("buildObject.person");
		person p=(person) cls.newInstance();
		p.setAge(16);
		p.setName("two person.");
		System.out.println(p.toString());
	}
	
	
	@Test
	public void testThree() throws Exception{
		//���л��뷴���л�
		
		//���л�����
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("e:/a.txt"));
		person p=new person();
		p.setAge(21);
		p.setName("three person.");
		out.writeObject("Hello �����л�");
		out.writeObject("Many World ..ȫ����");
		out.writeObject(new Date());
		out.writeObject(p);
		out.writeInt(123);
		out.close();
		
		
		//�����л�����
		ObjectInputStream  in=new ObjectInputStream(new FileInputStream("e:/a.txt"));
		System.out.println("obj1"+(String)in.readObject());
		System.out.println("obj1.1"+(String)in.readObject());
		System.out.println("obj2"+(Date)in.readObject());
		person p1=(person) in.readObject();
		System.out.println(p1.toString());
		int obj4=in.readInt();
		System.err.println("obj4:"+obj4);
		in.close();
	}

}
