package ss5_homework;

import java.io.File;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("nhap vao duong dan");
		String path =  scanner.nextLine();
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("Duong dan k ton tai");
		}else if (file.isDirectory()) {
			System.out.println("Day la duong dan den thu muc");
			File[] list	=file.listFiles();
			for(int i =0;i< list.length;i++) {
				if(list[i].isFile()) {
					System.out.println(list[i].getName()+": "+list[i].length()+" byte");
				}else {
					System.out.println(list[i].getName());
				}
			}
		}else {
			System.out.println("day la duong dan toi file");
		}
	}
}
