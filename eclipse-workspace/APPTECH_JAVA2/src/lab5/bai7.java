package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("nhap mot duong dan: ");
		String path = scanner.nextLine();
		System.out.println("nhap 1 ky tu: ");
		char w = scanner.next().charAt(0);
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("duong dan k ton tai");
		}else if(file.isDirectory()) {
			System.out.println("duong dan tro den thu muc");
		}else if (file.isFile()) {
			try(
					BufferedReader br = new BufferedReader(
							new InputStreamReader(
									new FileInputStream(file)));
					){
				String line;
				ArrayList<String> mList = new ArrayList<>(); 
				while((line=br.readLine())!=null) {
					String[] a =line.split("[ -]");
					for (int i = 0; i < a.length; i++) {
						mList.add(a[i]);
					}
					int count=0;
					for(int i=0;i<mList.size();i++) {
						String a1 = mList.get(i);
						for(int j=0;j<a1.length();j++) {
							if(w == a1.charAt(j)) count++;
						}
					}
					System.out.println("file co: "+count+" ky tu "+w);
					
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
}
