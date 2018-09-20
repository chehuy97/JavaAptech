package ss5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05BufferedReader {
	 public static void main(String[] args) {
		 String path="src\\DeThiThu\\nhap.txt";
		 BufferedReader br=null;
		// c1 br=new BufferedReader(new FileReader(path));
		 //fileReader extend fileInputstreamreader
		 try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));//c2
//			String line = br.readLine();
//			while(line!=null) {	
//				System.out.println(line);
//				line = br.readLine();
//		 }
			String line;
			while((line = br.readLine())!= null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
