package List;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		staticData s1=new staticData(100, "A");
		staticData s2=new staticData(20, "B");
		staticData s3=new staticData(2100, "C");
		staticData s4=new staticData(4, "D");
		staticData s5=new staticData(52, "E");
		
		
		TreeSet<staticData> tree=new TreeSet<staticData>();
		tree.add(s5);
		tree.add(s2);
		tree.add(s1);
		tree.add(s4);
		tree.add(s3);
		
		for(staticData s:tree){
			System.out.println("treeset-->"+s.toString());
		}
		
		
		
		List<staticData> li=new ArrayList<staticData>();
		li.add(s5);
		li.add(s2);
		li.add(s1);
		li.add(s4);
		li.add(s3);
		
		
		for(staticData s:li){
			System.out.println(s.toString());
		}
		
	}

}
