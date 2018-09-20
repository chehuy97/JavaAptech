package ss5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04FileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		String path="src\\ss5\\Output.txt" ;
		try {
			fos = new FileOutputStream(path);
			fos.write("Hello World\n".getBytes());
			fos.write("Artoria iz da bezt\n".getBytes());
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
