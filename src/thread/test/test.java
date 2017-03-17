package thread.test;

import java.util.UUID;

public class test {

	public static void main(String[] args) {
		String suuid=UUID.randomUUID().toString();
		if(suuid.length()>33){
            suuid=suuid.substring(0,31).replaceAll("-", "");
        }
		System.out.println(suuid+"   length:"+suuid.length());
	}
}
