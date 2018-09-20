package ss3;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class HW_Random {
	public static void main(String[] args) {
		Comparator comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o2.intValue()+o1.intValue();
			}
		};
		TreeSet<Integer> ts = new TreeSet<>();
		Random rand =  new Random();
		for(int i=0;i<1000;i++) {
			i=rand.nextInt(1000);
			ts.add(i);
		}
		for (Integer integer : ts) {
			System.out.println(integer);
		}
		System.out.println("Mang co "+ts.size()+" so khac nhau");
	}
}
