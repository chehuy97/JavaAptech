package de2;

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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.tools.jar.resources.jar;

public class Bai2 {
	public static void main(String[] args) {
		String path = "src\\de2\\input.txt";
		String path2 = "src\\de2\\error.txt";
		Connection con = null;
		PreparedStatement ps = null;
		PrintWriter pw = null;
		int nhap=1;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
			pw = new PrintWriter(path2);
			String line = null;
			ArrayList<String> mList = new ArrayList<>();
			while((line = br.readLine())!=null) {
				String[] a = line.split("[ ]");
				StringBuilder sb = new StringBuilder();
				for (int i = 1; i <= a.length-4; i++) {
					sb.append(a[i]+" ");
				}
				mList.add(a[0]);
				mList.add(sb.toString());
				mList.add(a[a.length-3]);
				mList.add(a[a.length-2]);
				mList.add(a[a.length-1]);
			}
			int i=0;
			while(i<mList.size()) {
				try {
					Integer.parseInt(mList.get(i));
				} catch (Exception e) {
					pw.println("Dong "+(i/5+1)+": ma so khong phai so nguyen");
				}
				
				try {
					Date date = new SimpleDateFormat("dd/MM/yyyy").parse(mList.get(i+2));
				} catch (Exception e) {
					// TODO: handle exception
					pw.println("Dong "+(i/5+1)+": ban nhap sai ngay sinh");
				}
				if(!mList.get(i+3).equalsIgnoreCase("Nam") && !mList.get(i+3).equalsIgnoreCase("Nu")) {
					pw.println("Dong "+(i/5+1)+": ban nhap sai gioi tinh");
				}
				try {
					Double.parseDouble(mList.get(i+4));
				} catch (Exception e) {
					pw.println("Dong "+(i/5+1)+": diem thi khong phai so thuc");
				}
				i=i+5;
			}
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://DESKTOP-VR6CH56\\SQLEXPRESS:1433;databaseName=HOCSINH";
			con = DriverManager.getConnection(url,"sa","huy9101997");
			String sql = "INSERT INTO qlhs VALUES (?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			int rs =0;
			for (int k = 0; k < mList.size(); k+=5) {
				ps.setString(1,mList.get(k));
				ps.setString(2,mList.get(k+1));
				ps.setString(3,mList.get(k+2));
				ps.setString(4,mList.get(k+3));
				ps.setString(5,mList.get(k+4));
				rs = ps.executeUpdate();
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
