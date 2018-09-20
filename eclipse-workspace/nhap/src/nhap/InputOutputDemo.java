package nhap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class InputOutputDemo {
	public static void main(String[] args) {
		String filename = "C:\\Users\\Quang Huy\\Desktop\\nhap.txt";
		String fileoname = "C:\\Users\\Quang Huy\\Desktop\\xuat.txt";
		try {
			Scanner scanner =  new Scanner(new File(filename));

				System.out.println(scanner.nextLine());
//			
//			FileInputStream f = new FileInputStream(filename);
//			int count =0;
//			int c;
//			while((c=f.read())!=-1) {
//				System.out.printf("%c",c);
//				count++;
//			}
			System.out.println();
//			System.out.println(count);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//			try {
//				FileInputStream f1 = new FileInputStream(filename);
//				BufferedReader br = new BufferedReader(new InputStreamReader(f1, "UTF8"));
//				
//				FileOutputStream f2 =  new FileOutputStream(fileoname);
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(f2,"UTF8"));
//				String s;
//				do {
//					if(s!=null && st!=null) bw.newLine();
//					s=st;
//					s=br.readLine();
//					bw.write(s);
//				}while((s=br.readLine())!=null);
//				//bw.write(br.readLine());
//				bw.flush();
//				System.out.println(br.readLine());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
}
}
