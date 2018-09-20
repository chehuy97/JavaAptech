package nhap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		String path1="C:\\Users\\Quang Huy\\Desktop\\nhap.txt";
		String path2="C:\\Users\\Quang Huy\\Desktop\\xuat.txt";
		
		File file =  new File(path1);
		
		try {
			fis =  new FileInputStream(path1);
			fos = new FileOutputStream(path2);
			while(fis.available()>0) {
				int n = fis.read();
				fos.write((char)n);	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
