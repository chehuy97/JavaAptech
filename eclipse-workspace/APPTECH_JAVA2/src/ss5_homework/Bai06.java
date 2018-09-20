package ss5_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Scanner;

public class Bai06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap duong dan toi file");
		String path = scanner.nextLine();
		File file = new File(path);
		try(
	            BufferedReader br = new BufferedReader(
	                    new InputStreamReader(
	                            new FileInputStream(file)));
	            ) {
			String line;
			int sotu=0;
			while((line = br.readLine()) != null) {
				String[] a = line.split("[ ;]");
				sotu+=a.length;
			}
			System.out.println("so tu cua file: "+sotu);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
//		String line;
//		int sotu=0;
//		while((line = br.readLine()) != null) {
//			String[] a = line.split("[ ;]");
//			sotu+=a.length;
//		}
//		System.out.println("so tu cua file: "+sotu);
	}
}
