package ss5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis=null;
		byte[] b = new byte[4096];
		String path="src\\ss5\\data.txt";
			try {
			fis = new FileInputStream(path);
			while(fis.available()>0) {
				//doc 1 mang byte
				int n =fis.read(b);
				System.out.println(new String(b, 0, n));
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
