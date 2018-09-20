package ss3;

import java.util.LinkedHashSet;

public class Ex02LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(10.5);
		lhs.add("Arturia Perdragon");
		lhs.add("Arturia Perdragon");
		lhs.add(10);
	for (Object object : lhs) {
		System.out.println(object);
	}
	//Linkhashset co thu tu dau vao
	}
}
