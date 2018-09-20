package de1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("nhap mot duong dan: ");
		String path = scanner.nextLine();
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
					String[] a =line.split("[ ]");
					StringBuilder sb = new StringBuilder();
					for (int i = 1; i <= a.length-3; i++) {
						sb.append(a[i] + " ");
					}
						mList.add(a[0]);	
						mList.add(sb.toString());
						mList.add(a[a.length-2]);
						mList.add(a[a.length-1]);
					}
				for (String string : mList) {
					System.out.println(string);
				}
				System.out.println("size: "+ mList.size());
					
				
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
