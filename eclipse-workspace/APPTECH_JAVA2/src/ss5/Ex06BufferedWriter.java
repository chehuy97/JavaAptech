package ss5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex06BufferedWriter {
	public static void main(String[] args) {
		String path = "src\\ss5\\Text.txt";
		PrintWriter pw = null;
		try {
			pw=new PrintWriter(path);
			String aString= "/2018";
			pw.printf("Tottenham Se La Doi Bong Vo Dich Champion League"+" 2017"+aString);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pw.close();
		}
	}
}
