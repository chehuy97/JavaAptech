package de3;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Bai2 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps =  null;
		ArrayList<String> mList = new ArrayList<>();
		String path = "src\\de3\\input.txt";
		String log ="src\\de3\\log.txt";
		PrintWriter pw =null;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
			String line;
			while((line=br.readLine())!=null) {
				String[] a = line.split("[ ]");
				for (int i = 0; i < a.length; i++) {
					mList.add(a[i]);
				}
			}
			int j=0;
			pw = new PrintWriter(log);
			while(j<mList.size()) {
				try {
					Integer.parseInt(mList.get(j));
				} catch (Exception e) {
					// TODO: handle exception
					pw.println("dong "+(j/4+1)+": X khong phai so nguyen");
				}
				try {
					Integer.parseInt(mList.get(j+1));
				} catch (Exception e) {
					// TODO: handle exception
					pw.println("dong "+(j/4+1)+": Y khong phai so nguyen");
				}
				try {
					Integer.parseInt(mList.get(j+2));
				} catch (Exception e) {
					// TODO: handle exception
					pw.println("dong "+(j/4+1)+": R khong phai so nguyen");
				}
				try {
					Color color = (Color) Color.class.getField(mList.get(j+3)).get(null);
				} catch (Exception e) {
					// TODO: handle exception
					pw.println("dong "+(j/4+1)+": khong phai color");
				}
				j+=4;
			}
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-VR6CH56\\SQLEXPRESS:1433;databaseName=HOCSINH","sa","huy9101997");
			String sql = "insert into Circle values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			int rs =0;
			for (int i = 0; i < mList.size(); i+=4) {
				ps.setString(1, mList.get(i));
				ps.setString(2, mList.get(i+1));
				ps.setString(3, mList.get(i+2));
				ps.setString(4, mList.get(i+3));
				rs=ps.executeUpdate();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pw.close();
		}
	}
}
