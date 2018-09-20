package ss5_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		String path = "src\\ss5\\Input.txt";
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao mot ky tu");
		char w = scanner.next().charAt(0);
		try {
			scanner = new Scanner(new File(path));
			ArrayList<String> mList = new ArrayList<>();
			while(scanner.hasNext()) {
				String mString = scanner.next();
				mList.add(mString);
			}
			int count=0;
			for(int i=0;i<mList.size();i++) {
				String a = mList.get(i);
				for(int j=0;j<a.length();j++) {
					if(w == a.charAt(j)) count++;
				}
			}
			System.out.println("file co: "+count+" ky tu "+w);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
