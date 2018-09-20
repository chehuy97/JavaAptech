package ss3;

import java.util.HashMap;
import java.util.Set;

public class Ex07HashmapDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Hello", "Xin Chao");
		hm.put("Hi", "Xin Chao");
		hm.put("Hi", "Chao");
		hm.put("Bye", "Tam Biet");
		Set keys = hm.keySet();
		for (Object key : keys) {
			System.out.println(key + ": "+hm.get(key));
		}
		
		
	}
}
