package ss5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07TryWithResoureDemo {
	public static void main(String[] args) {
		String path="src\\ss5\\data.txt";
		try(BufferedReader br =  new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
			String line = br.readLine();
			while((line=br.readLine())!=null) {
				System.out.println(line);
				line=br.readLine();
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
