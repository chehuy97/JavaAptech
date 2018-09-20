package ss5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis=null;
		String path="src\\ss5\\data.txt";
			try {
			fis = new FileInputStream(path);
			while(fis.available()>0) {
				int n=	fis.read();
				System.out.print((char)n);
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("k co file can tim");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("loi doc file");
			}	finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		

}
}