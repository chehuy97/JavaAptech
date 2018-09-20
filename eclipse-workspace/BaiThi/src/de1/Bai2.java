package de1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps =  null;
		int rs =0;
		ResultSet result = null;
		String path = "src\\DeThiThu\\nhap1.txt";
		ArrayList mList = new ArrayList();
		
		try {
			Scanner scanner =  new Scanner(new File(path));
			while (scanner.hasNext()) {
				String a = scanner.next();
				mList.add(a);
			}
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String link = "jdbc:sqlserver://DESKTOP-VR6CH56\\SQLEXPRESS:1433;databaseName=HOCSINH";
			String user = "sa";
			String pass = "huy9101997";
			String sql = "INSERT INTO hocsinh VALUES (?,?,?,?);";
			con = DriverManager.getConnection(link,user,pass);
			ps = con.prepareStatement(sql);		
			for (int i = 0; i < mList.size(); i+=4) {
				ps.setString(1, (String) mList.get(i));
				ps.setString(2, (String) mList.get(i+1));
				ps.setString(3, (String) mList.get(i+2));
				ps.setString(4, (String) mList.get(i+3));
				rs = ps.executeUpdate();
			}			
			result=ps.executeQuery("SELECT *FROM hocsinh");
			while (result.next()) {
				System.out.printf("%-10s %-15s %-10s %-10s",result.getString(1),result.getString(2),result.getString(3),result.getString(4));
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
