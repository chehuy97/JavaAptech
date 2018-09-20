package de2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Nhom22{
	public static void main(String[] agrs) throws IOException, SQLException {
	File file1 = new File("src\\de2\\input.txt");
	String connection = "jdbc:sqlserver://DESKTOP-VR6CH56\\\\SQLEXPRESS:1433;databaseName=HOCSINH"; 
	Connection con =null;
	ResultSet rs = null;
	PreparedStatement pts=null;
	String error=null;
	try {
		String line=null;
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
		con = DriverManager.getConnection(connection,"sa","huy9101997");
		String sql=null;
		char[] c=null;
		String mahocvien = null;
		String tenhocvien = null;
		String ngaysinh = null;
		String gioitinh = null;
		String diemthi = null;
		int i=0;
		while((line=br.readLine()) != null) {
			i++;
			try{System.out.println(""+line);
			c=line.toCharArray();
			System.out.println("do dai line: "+line.length());
			mahocvien =String.copyValueOf(c, 0, 4).trim();
			tenhocvien=String.copyValueOf(c, 4, 18).trim();
			ngaysinh=String.copyValueOf(c, 22, 10).trim();
			gioitinh=String.copyValueOf(c, 32, 3).trim();
			diemthi=String.copyValueOf(c, 35, 2).trim();
			sql="insert into qlhs values('"+mahocvien+"','"+tenhocvien+"','"+ngaysinh+"','"+gioitinh+"','"+diemthi+"')";      
			pts=con.prepareStatement(sql);
			pts.executeUpdate();
			}catch (Exception e) {
				System.out.print("Dong "+i+" ");
				System.out.println("sai dinh dang ngay sinh");
//				BufferedWriter bf = new BufferedWriter(new FileWriter("input.txt",true));
//				bf.write("dong "+i+" sai dinh dang ngay sinh");
//				System.out.println("da ghi xong loi");
				error = "dong "+i+" sai dinh dang ngay sinh";
				writeUsingFiles(error);
			}
		}
		fr.close();
		br.close();
		con.close();
		pts.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	private static void writeUsingFiles(String data) {
	    try {
	      Files.write(Paths.get("src\\de2\\error.txt"), data.getBytes());
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
}

