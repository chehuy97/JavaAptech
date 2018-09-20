package ss5_homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\Quang Huy\\Desktop\\nhap.txt";
		String path2 = "C:\\Users\\Quang Huy\\Desktop\\xuat.txt";
		String aString = null;
		try {
			FileInputStream  fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			int c;
			while((c=fis.read())!=-1) {
				 fos.write(c);
			}
			System.out.println(aString);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
