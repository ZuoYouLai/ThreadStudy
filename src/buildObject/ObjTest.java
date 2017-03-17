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
		//第一种创建方式:new
		person p=new person();
		p.setAge(12);
		p.setName("one person.");
		System.out.println(p.toString());
	}
	
	
	@Test
	public void testTwo() throws Exception{
		//第二种：class来获取
		Class cls=Class.forName("buildObject.person");
		person p=(person) cls.newInstance();
		p.setAge(16);
		p.setName("two person.");
		System.out.println(p.toString());
	}
	
	
	@Test
	public void testThree() throws Exception{
		//序列化与反序列化
		
		//序列化对象
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("e:/a.txt"));
		person p=new person();
		p.setAge(21);
		p.setName("three person.");
		out.writeObject("Hello 反序列化");
		out.writeObject("Many World ..全世界");
		out.writeObject(new Date());
		out.writeObject(p);
		out.writeInt(123);
		out.close();
		
		
		//反序列化对象
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
