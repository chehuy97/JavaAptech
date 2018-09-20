package ss5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex03BufferedInputStreamDemo {
	public static void main(String[] args) {
		String path="src\\ss5\\data.txt";
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		byte[] b =  new byte[4096];
		
		try {
			fis= new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			while(bis.available()>0) {
				int n = bis.read(b);
				System.out.println(new String(b,0,n));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
				bis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
