package ss5_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		String path = "src\\ss5\\nhap.txt";
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = scanner.nextInt();
		try {
			scanner = new Scanner(new File(path));
			ArrayList<String> mList = new ArrayList<>();
			while(scanner.hasNext()) {
				String mString = scanner.next();
				mList.add(mString);
			}
			ArrayList<Student> arr = new ArrayList<>();
			for (int i = 0; i < mList.size(); i+=3) {
				int k = Integer.parseInt(mList.get(i+2));
				arr.add(new Student(mList.get(i), mList.get(i+1),k ));
			}
//			for (Student student : arr) {
//				System.out.println(student);
//			}
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getDiem()>n) {
					System.out.println(arr.get(i));
				}
			}
			System.out.println("Nguoi co diem cao nhat: ");
			int max=arr.get(0).getDiem(),a=0;
			for(int i=0;i<arr.size();i++) {
				if(max < arr.get(i).getDiem()) {
					max= arr.get(i).getDiem();
					a=i;
				}
			}
			System.out.println(arr.get(a));
			System.out.println("Nguoi co diem nho nhat: ");
			int min=arr.get(0).getDiem(),b=0;
			for(int i=0;i<arr.size();i++) {
				if(min > arr.get(i).getDiem()) {
					min= arr.get(i).getDiem();
					b=i;
				}
			}
			System.out.println(arr.get(b));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
