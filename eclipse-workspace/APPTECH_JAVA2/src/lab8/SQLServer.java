package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLServer {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PrintWriter pw = null;
		String path = "src\\ss5\\Text.txt";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-VR6CH56\\SQLEXPRESS:1433;databaseName=QuanLyGiaoHang","sa","huy9101997");
			String sql ="select *from KHACHHANG ";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			pw = new PrintWriter(path);
			while (rs.next()) {
				pw.printf("%-10s %-10s %-20s %-20s %-20s %-25s %-20s \n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				System.out.printf("%-10s %-10s %-20s %-20s %-20s %-25s %-20s \n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			pw.close();
		}
	}
}
